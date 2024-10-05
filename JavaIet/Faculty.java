package Five_Oct_2024;

import java.util.Arrays;

public class Faculty extends Person{
    private String specialSubject;
    private String[] skills;
    private double salary;

    Faculty(int id, String address, String name, String specialSubject, String[] skills, double salary) {
        super(id, address, name);
        this.specialSubject = specialSubject;
        this.skills = skills;
        this.salary = salary;
    }

    Faculty(String specialSubject, String[] skills, double salary) {
        this.specialSubject = specialSubject;
        this.skills = skills;
        this.salary = salary;
    }
    Faculty(){}

    public String getSpecialSubject() {
        return specialSubject;
    }

    public void setSpecialSubject(String specialSubject) {
        this.specialSubject = specialSubject;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Faculty{" +
                "specialSubject='" + specialSubject + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", salary=" + salary +
                '}';
    }
}
