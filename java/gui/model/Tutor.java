package gui.model;

public class Tutor extends Teacher{
    private int workingHour;

    public Tutor(String name, String address, int workingHour) {
        super(name, address);
        this.workingHour = workingHour;
    }

    public int getSalary() {
        return workingHour;
    }

    public void setSalary(int salary) {
        this.workingHour = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "salary=" + workingHour +
                '}';
    }
}
