public abstract class Employee {
    private int id;
    private String department;
    private String name;
    private boolean working;

    public Employee(int id, String department, String name, boolean working) {
        this.id = id;
        this.department = department;
        this.name = name;
        this.working = working;
    }
    public abstract void performDuties();
    @Override
    public String toString() {
        return "Employee [id="+id+" , name - "+name+", department - "+department+", working = "+working+" ]";
    }
}
