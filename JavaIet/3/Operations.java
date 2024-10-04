import java.text.DecimalFormat;
import java.util.*;

public class Operations {
    static Student[] students;
    static int cnt;
    static  Scanner sc = new Scanner(System.in);
    static Set<Integer> set = new HashSet<>();

    static{
        students = new Student[100];
        cnt = 0;
        students[cnt++] = new Student(1,"James",88,77,66);
        students[cnt++] = new Student(2,"Joy",78,75,64);
        students[cnt++] = new Student(3,"Arron",95,90,90);
        set.add(students[0].getId());
        set.add(students[1].getId());
        set.add(students[2].getId());
    }

    //Enter new Student
    public static boolean newEntry(){
        System.out.println("Enter details for new Entry : ");
        System.out.print("ID :"); int id = sc.nextInt();

        while(set.contains(id)){
            System.out.println("same id exists already enter new id : ");
            id = sc.nextInt();
        }

        set.add(id);
        sc.nextLine();
        System.out.print("Name :"); String name = sc.nextLine();
        System.out.println();
        System.out.print("Marks For m1 :"); int m1 = sc.nextInt();
        System.out.println();
        System.out.print("Marks For m2 :"); int m2 = sc.nextInt();
        System.out.println();
        System.out.print("Marks For m3 :"); int m3 = sc.nextInt();

        students[cnt++] = new Student(id,name,m1,m2,m3);
        if(students[cnt - 1].getId() == id){
            return true;
        }
        return false;
    }

    //Find student By id
    static public Student findStudentById(){
        System.out.println("Enter id of student you want to find : ");
        int idd = sc.nextInt();
        for(int i =0; i < students.length; i++){
            if(students[i] != null){
                if(students[i].getId() == idd){
                    return students[i];
                }
            }else{
                break;
            }
        }
        return  null;
    }

    // Find students by name
    static public Student[] findStudentByName(){
        System.out.println("Enter Name of students you want to find : ");
        ArrayList<Student> list = new ArrayList<>();
        String name = sc.next();
        int count = 0;

        for(int i =0; i < students.length; i++){
            if(students[i] != null){
                if(students[i].getName().equals(name)){
                    list.add(students[i]);
                }
            }else{
                break;
            }
        }

        Student[] ans = new Student[list.size()];
        int index = 0;
        for(Student i : list){
            ans[index++] = i;
        }
        return  ans.length != 0 ? ans : null;
    }

    //Show all students
    static public Student[] showAllStudents(){
        Student[] ans = new Student[cnt];
        for(int i =0; i < cnt; i++){
            ans[i] = students[i];
        }
        return  ans.length != 0 ? ans : null;
    }

    //.5 Get Averagr marks with name
    static public void marksAvg(){
        for(int i =0; i < cnt; i++){
            String n = students[i].getName();
            int m1 = students[i].getMarks1();
            int m2 = students[i].getMarks2();
            int m3 = students[i].getMarks3();
            double avg = (double) (m1+m2+m3)/3;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            String num = decimalFormat.format(avg);

            System.out.println("Student " +  students[i].getName() + ", Got : " + num + "%.");
        }
    }

    //6. Update marks by id
    static public boolean updateMarksById(){
        System.out.print("Enter id of student whos marks you want to update ");
        int id = sc.nextInt();
        System.out.println("Marks for m1,m2 & m3 in sequence : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        for(int i =0; i < cnt; i++){
            if(students[i] != null){
                if(students[i].getId() == id){
                    students[i].setMarks1(m1);
                    students[i].setMarks2(m2);
                    students[i].setMarks3(m3);
                    return true;
                }
            }else{
                break;
            }
        }
        return false;
    }

    //7. Delete student by Id
    public static boolean deleteStudent(){
        System.out.println("Enter id of student you want to delete");
        int id = sc.nextInt();
        for(int i =0; i < cnt; i++){
            if(students[i] != null){
                if(students[i].getId() == id){
                    for(int j = i; j < cnt ; j++){
                        students[j] = students[j+1];
                    }
                    students[cnt--] = null;
                    return true;
                }
            }
        }
        return false;
    }

    //8.total Students
    static public int GetCountOfStudents(){
        return cnt;
    }

    //sort by average marks
    public static boolean sortByAverageMarks() {
        if (cnt == 0) return false;
        double[] avg = new double[cnt];

        for (int i = 0; i < cnt; i++) {
            int m1 = students[i].getMarks1();
            int m2 = students[i].getMarks2();
            int m3 = students[i].getMarks3();
            double average = (double) (m1 + m2 + m3) / 3;
            avg[i] = average;
        }

        for (int i = 0; i < cnt - 1; i++) {
            for (int j = 0; j < cnt - i -1; j++) {
                if (avg[j] < avg[j + 1]) {
                    double temp = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = temp;
                    Student tempStd = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tempStd;
                }
            }
        }

        for(int i =0; i < cnt; i++){
            String n = students[i].getName();
            int m1 = students[i].getMarks1();
            int m2 = students[i].getMarks2();
            int m3 = students[i].getMarks3();
            double avgg = (double) (m1+m2+m3)/3;
            int rank = i + 1;
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            String num = decimalFormat.format(avgg);

            System.out.println("Student " +  students[i].getName() + ", Got : " + num + "%.  Rank-" + rank);
        }
        return true;
    }
}
