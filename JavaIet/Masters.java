package Five_Oct_2024;

public class Masters extends  Student{
    private String degree;
    private String thesis;
    private int thesisMarks;

    public Masters(int id, String address, String name, int[] marks, String degree, String thesis, int thesisMarks) {
        super(id, address, name, marks);
        this.degree = degree;
        this.thesis = thesis;
        this.thesisMarks = thesisMarks;
    }

    public Masters(int[] marks, String degree, String thesis, int thesisMarks) {
        super(marks);
        this.degree = degree;
        this.thesis = thesis;
        this.thesisMarks = thesisMarks;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }


    public int getThesisMarks() {
        return thesisMarks;
    }

    public void setThesisMarks(int thesisMarks) {
        this.thesisMarks = thesisMarks;
    }

    public String toString() {
        return super.toString() + " Masters {" +
                "degree='" + degree + '\'' +
                ", thesis='" + thesis + '\'' +
                ", thesisMarks='" + thesisMarks + '\'' +
                " } ";
    }
}
