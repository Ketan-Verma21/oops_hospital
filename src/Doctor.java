public class Doctor extends Employee{
    public Doctor(int id, String department, String name, boolean working) {
        super(id, department, name, working);
        System.out.println("Doctor in action \n");
    }

    @Override
    public void performDuties() {
        System.out.println("DOCTOR IS WORKING NOW !!!");
        prescribeMedicine();
        diagnosePatient();
        System.out.println("\n");
    }

    private void prescribeMedicine(){
        System.out.println("prescribing medicine");
    }
    private void diagnosePatient(){
        System.out.println("diagnosing patient");
    }

}
