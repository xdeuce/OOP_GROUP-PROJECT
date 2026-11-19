
public abstract class InventoryItem{
    private String name;
    private final String itemId;
    private int quantity;
    private double unitPrice;
    private int reorderLevel;
    public static final int DEFAULT_REORDER_THRESHOLD = 10;

    public InventoryItem(String name, String itemId, int quantity, double unitPrice) {
        
        this(name,itemId,quantity,unitPrice,DEFAULT_REORDER_THRESHOLD);
    }
    
    public InventoryItem(String name, String itemId, int quantity, double unitPrice, int reorderLevel) {
        if(name == null || name.isBlank()){
           throw new IllegalArgumentException("The name cannot be null nor empty");
        }
        else if(itemId == null || itemId.isBlank()){
           throw new IllegalArgumentException("The itemId cannot be null nor empty");
        }
        else if(quantity < 0 || unitPrice < 0){
            throw new IllegalArgumentException("Neither the quantity nor unit price can be negative");
        }
        else if(reorderLevel < 1){
            throw new IllegalArgumentException("The reorder level can't be below 1");
        }

        this.name = name.trim();
        this.itemId = itemId.trim();
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.reorderLevel = reorderLevel;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0){
            throw new IllegalArgumentException("The unit price can be negative");
        }
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()){
           throw new IllegalArgumentException("The name cannot be null nor empty");
        }
        this.name = name.trim();
    }

    public String getItemId() {
        return itemId;
    }

     
    public int getReorderLevel() {
    return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        if(reorderLevel < 1){
                throw new IllegalArgumentException("The reorder level can't be below 1");
            }
        this.reorderLevel = reorderLevel;
    }


    public void addStock(int addValue){
        if(addValue <= 0){
        throw new IllegalArgumentException("You can't add 0 or a negative number of items");

        }
        quantity += addValue; 
    }
   
    public void removeStock(int subtractValue){
        if(subtractValue > quantity || subtractValue < 1){
        throw new IllegalArgumentException("The value entered surpasses the stock or is not substantial");
        }

        quantity -= subtractValue;
    }
    public boolean needsRestocking(){
        if(getQuantity() < reorderLevel){
            return true;
        }
        return false;
    }

    public abstract String getCategory();

    public abstract boolean isUsable();
    
    
}
