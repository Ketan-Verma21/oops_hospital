public class Nurse extends Employee{
    public Nurse(int id, String department, String name, boolean working) {
        super(id, department, name, working);
        System.out.println("Nurse in action \n");
    }

    @Override
    public void performDuties() {
        System.out.println("NURSE IS WORKING NOW !!!!!!");
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
        System.out.println("\n");
    }

    private void checkVitalSigns(){
        System.out.println("checking vitals ");
    }
    private void drawBlood(){
        System.out.println("drawing blood");
    }
    private void cleanPatientArea(){
        System.out.println("cleaning patient area");
    }

}
