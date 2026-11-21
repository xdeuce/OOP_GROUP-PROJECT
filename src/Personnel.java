public abstract class Personnel{

   

    private String staffID;
    private String name;
    private int age;
    private String gender;
    private String phoneNumber;
    private String address;
    private double salary;

    public Personnel() {
    }

    public Personnel(String staffID, String name, int age, String gender,
                     String phoneNumber, String address, double salary) {
            setStaffID(staffID);
            setName(name);
            setAge(age);
            setGender(gender);
            setPhoneNumber(phoneNumber);
            setAddress(address);
            setSalary(salary);
    }

    public String getPersonnelID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    public void setStaffID(String personnelID) {
        this.staffID = personnelID;
    }

    public void displayPersonnelDetails() {
        System.out.println("ID: " + staffID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
 

}