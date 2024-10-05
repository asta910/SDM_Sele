package Five_Oct_2024;

import java.util.Arrays;

public class Student extends Person{
    private int[] marks;

    Student(int id, String address, String name, int[] marks) {
        super(id, address, name);
        this.marks = marks;
    }

    Student(int[] marks) {
        this.marks = marks;
    }
    public int avgMarks(){
        int sum = 0;
        int n = marks.length;
        for(int i : marks) sum += i;
        return sum/n;
    }
    @Override
    public String toString() {
        return super.toString() + "   Marks{ " +
                " marks = " + Arrays.toString(marks) +
                " }";
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
