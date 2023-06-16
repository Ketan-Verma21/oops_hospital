public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector=new HospitalManagement();
        Employee Nancy=new Nurse(121,"emergency","Nancy",true);
        Employee carter=new Doctor(466,"emergency","Carter",true);
        ERDirector.call_upon(Nancy);

    }
}
