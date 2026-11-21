class NonMedicalStaff extends Personnel{
    private String jobTitle;
    private String department;
    private String shift;




    
    public NonMedicalStaff(String jobTitle, String department, String shift) {
                setJobTitle(jobTitle);
                setDepartment(department);
                setShift(shift);
    }
    public NonMedicalStaff(String staffID, String name, int age, String gender, String phoneNumber, double salary,
            String address, String jobTitle, String department, String shift) {
        super(staffID, name, age, gender, phoneNumber, salary, address);
                setJobTitle(jobTitle);
                setDepartment(department);
                setShift(shift);
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }


    
    
}
