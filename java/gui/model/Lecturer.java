package gui.model;

public class Lecturer extends Teacher{
    private int salary;

    public Lecturer() {
        super("", "");
    }
    public Lecturer(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "salary=" + salary +
                '}';
    }
}
