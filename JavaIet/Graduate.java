package Five_Oct_2024;

public class Graduate extends Student {
    private String specialSubject;
    private int specialSubjectMarks;

    Graduate(int id, String address, String name, int[] marks, String specialSubject, int specialSubjectMarks) {
        super(id, address, name, marks);
        this.specialSubject = specialSubject;
        this.specialSubjectMarks = specialSubjectMarks;
    }

    Graduate(int[] marks, String specialSubject, int specialSubjectMarks) {
        super(marks);
        this.specialSubject = specialSubject;
        this.specialSubjectMarks = specialSubjectMarks;
    }

    public String toString() {
        return "Graduate{" +
                "specialSubject='" + specialSubject + '\'' +
                ", specialSubjectMarks=" + specialSubjectMarks +
                '}';
    }

    public String getSpecialSubject() {
        return specialSubject;
    }

    public void setSpecialSubject(String specialSubject) {
        this.specialSubject = specialSubject;
    }

    public int getSpecialSubjectMarks() {
        return specialSubjectMarks;
    }

    public void setSpecialSubjectMarks(int specialSubjectMarks) {
        this.specialSubjectMarks = specialSubjectMarks;
    }


}
