class SubMedicalStaff extends Personnel {
    private String department;
    private String qualification;
    private String shift;


    public SubMedicalStaff(){

    }

    public SubMedicalStaff(String department, String qualification, String shift) {
        setDepartment(department);
        setQualification(qualification);
        setShift(shift);
    }
    public SubMedicalStaff(String staffID, String name, int age, String gender, String phoneNumber, double salary,
            String address, String department, String qualification, String shift) {
        super(staffID, name, age, gender, phoneNumber, salary, address);
        setDepartment(department);
        setQualification(qualification);
        setShift(shift);

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }






    
}
