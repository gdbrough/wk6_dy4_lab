import static java.lang.Math.*;

public abstract class Employee {

    public String name;
    public String niNumber;
    public int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    };

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        if (increase > 0) {
            Double oldSalary = (double) getSalary();
            Double newSalary = oldSalary + increase;
            this.salary = (int) round(newSalary);
        }
    }

    public int payBonus(){
        int bonus = getSalary() / 100;
        return bonus;
    }

    public void setName(String name) {
        if ((name != null) && (name != "")) {
            this.name = name;
        }
    }
}
