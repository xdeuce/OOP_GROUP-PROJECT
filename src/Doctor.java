class  Doctor extends Personnel{
    private String specialization;
    private double consultFee ;
    private String schedule;




    public Doctor(){

    };


    public Doctor(String specialization, double consultFee, String schedule) {
        this.specialization = specialization;
        this.consultFee = consultFee;
        this.schedule = schedule;
    }


    public Doctor(String staffID, String name, int age, String gender, String phoneNumber, String address,
            double salary, String specialization, double consultFee, String schedule) {
        super(staffID, name, age, gender, phoneNumber, address, salary);
        this.specialization = specialization;
        this.consultFee = consultFee;
        this.schedule = schedule;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultFee() {
        return consultFee;
    }

    public void setConsultFee(double consultFee) {
        this.consultFee = consultFee;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }




    
    
}
