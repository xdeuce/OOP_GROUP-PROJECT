import java.time.LocalDate;
public class Drug extends InventoryItem{
    private final LocalDate expiryDate;
    private String manufacturerName ;
    private final String batchNumber;
    private String strength;
    private boolean isPrescriptionDrug;
    private final DosageForm dosageForm;
    private final StorageCondition storageCondition;


    public Drug(String name, String itemId, int quantity, double unitPrice, LocalDate expiryDate,
            String manufacturerName, String batchNumber, String strength, boolean isPrescriptionDrug,
            DosageForm dosageForm, StorageCondition storageCondition) {
        
        
        this(name, itemId, quantity, unitPrice, DEFAULT_REORDER_THRESHOLD,
            expiryDate, manufacturerName, batchNumber, strength,
            isPrescriptionDrug, dosageForm, storageCondition);
    }

    public Drug(String name, String itemId, int quantity, double unitPrice, int reorderLevel,
            LocalDate expiryDate, String manufacturerName, String batchNumber, String strength,
            boolean isPrescriptionDrug, DosageForm dosageForm, StorageCondition storageCondition) {
        super(name, itemId, quantity, unitPrice, reorderLevel);

        if(expiryDate == null){
           throw new IllegalArgumentException("The expiry date cannot be null");
        }
        else if(dosageForm == null){
           throw new IllegalArgumentException("The dosage form cannot be null");
        }
        else if(storageCondition == null){
           throw new IllegalArgumentException("The storage condition cannot be null");
        }
        else if(strength == null || strength.isBlank()){
           throw new IllegalArgumentException("The strength of a drug cannot be null nor empty");
        }
        else if(batchNumber == null || batchNumber.isBlank()){
           throw new IllegalArgumentException("The batch numberof a drug cannot be null nor empty");
        }
        this.expiryDate = expiryDate;
        this.manufacturerName = manufacturerName;
        this.batchNumber = batchNumber.trim();
        this.strength = strength.trim();
        this.isPrescriptionDrug = isPrescriptionDrug;
        this.dosageForm = dosageForm;
        this.storageCondition = storageCondition;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        if(strength == null || strength.isBlank()){
           throw new IllegalArgumentException("The strength of a drug cannot be null nor empty");
        }
        
        this.strength = strength.trim();
    }

    public boolean isPrescriptionDrug() {
        return isPrescriptionDrug;
    }

    public void setPrescriptionDrug(boolean isPrescriptionDrug) {
        this.isPrescriptionDrug = isPrescriptionDrug;
    }

    public DosageForm getDosageForm() {
        return dosageForm;
    }

    public StorageCondition getStorageCondition() {
        return storageCondition;
    }

    public boolean isExpired(){
        if (this.expiryDate.isBefore(LocalDate.now()) || this.expiryDate.isEqual(LocalDate.now())){
            return true;
        }
        return false;
    }
    
    @Override 
    public String getCategory(){
        return("DRUG");
    }

    @Override
    public boolean isUsable(){
        if(this.isExpired()){
            return false;
        }
        return true;
    }
    

}
