package Five_Oct_2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Operations {
    static public Person[] personArray;
    static int count;
    static Scanner sc = new Scanner(System.in);
    private static  HashSet<Integer> graduationSet = new HashSet<>();
    private static  HashSet<Integer> mastersSet = new HashSet<>();
    private static  HashSet<Integer> facultySet = new HashSet<>();


    static {
        personArray = new Person[100];
        count = 0;

        Person grad = new Graduate(1,"Pune","Yogesh",new int[] {100,200} ,"ALZEBRA",99);
        personArray[count++] = grad;
        graduationSet.add(1);

        Person master = new Masters(2,"pune","Omennn",new int[]{20,30,40},"Masters","Psychology",1999);
        personArray[count++] = master;
        mastersSet.add(2);
    }

    //1. Add Student
    public static boolean addStudent(){
        System.out.println("Which type of student do you want to enter? Press:");
        System.out.println("1. For Graduation student");
        System.out.println("2. For Masters Student");
        System.out.println("3. For Faculty");
        System.out.println("4. Exit");

        System.out.print("Select your choice: ");
        int option = sc.nextInt();

        if(option == 1) { // Graduation student
            System.out.print("Enter student id: ");
            int gid = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter student Name: ");
            String gName = sc.nextLine();
            System.out.print("Enter student address: ");
            String gAddress = sc.nextLine();
            int[] marks = new int[3];
            System.out.print("Enter marks of three subjects: ");
            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();
            }
            sc.nextLine(); // Consume newline
            System.out.print("Enter special subject name: ");
            String gSub = sc.nextLine();
            System.out.print("Enter special subject marks: ");
            int gSubMarks = sc.nextInt();
            // Add Graduate student to the array
            personArray[count++] = new Graduate(gid, gAddress, gName, marks, gSub, gSubMarks);
            graduationSet.add(gid);
            return true;
        }else if(option == 2){
            System.out.print("Enter student id: ");
            int mid = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter student Name: ");
            String mName = sc.nextLine();
            System.out.print("Enter student address: ");
            String mAddress = sc.nextLine();
            int[] marks = new int[3];
            System.out.print("Enter marks of three subjects: ");
            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Enter Degree name: ");
            String mDeg = sc.nextLine();
            System.out.print("Enter special Theisis subject marks: ");
            String newThesis= sc.nextLine();


            System.out.print("Enter special Theisis subject marks: ");
            int newThesisMarks= sc.nextInt();

            Masters m = new Masters(mid,mAddress,mName,marks,mDeg,newThesis,newThesisMarks);
            personArray[count++] = m;
            mastersSet.add(mid);
            return true;
        }
        else if(option == 3) {
            System.out.print("Enter Faculty id: ");
            int fid = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Faculty Name: ");
            String fName = sc.nextLine();
            System.out.print("Enter Faculty address: ");
            String fAddress = sc.nextLine();

            System.out.print("Enter Faculty special subject : ");
            String specialSubject = sc.nextLine();

            System.out.println("How many skills you want to add for this faculty ? ");
            int skillNum = sc.nextInt();
            String[] skillArr = new String[skillNum];
            for (int i =0; i < skillNum; i++){
                System.out.print("Enter skill name :");
                skillArr[i] = sc.nextLine();
            }

            System.out.print("Enter Faculty Salary : ");
            double sal = sc.nextDouble();
            Faculty fac = new Faculty(fid,fAddress,fName,specialSubject,skillArr,sal);
            personArray[count++] = fac;
            facultySet.add(fid);
            return true;
        }else {
            System.out.println("Wrong choice. Please try again.");
        }
        return true;
    }

    //2. show all
    static public Person[] showAllPeopels(){
        int count = 0;
        for (Person p : personArray){
            if(p != null){
                count++;
            }else{
                break;
            }
        }
        Person[] ans = new Person[count];
        for (int i =0; i < count; i++){
            ans[i] = personArray[i];
        }
        return ans;
    }

    //3.Update marks
    static public boolean updateMarks(){
        System.out.print("Enter id of student whose marks you want to update ");
        int idForMarks = sc.nextInt();

        for (Person p : personArray){
            if (p != null){
                if(p instanceof Student){
                    if(p.getId() == idForMarks){
                        System.out.println("Enter marks for three subjects : ");
                        int[] newArr = new int[3];
                        for (int i = 0; i < 3; i++) {
                            newArr[i] = sc.nextInt();
                        }
                        ((Student) p).setMarks(newArr);
                        return true;
                        }
                    }
            }else{
                break;
            }
        }
        return false;
    }

    //4. delete student
    public static boolean deleteStudent(){
        System.out.print("Enter id of student you want to delete :  ");
        int delId = sc.nextInt();
        for (int i =0; i < count; i++){
            if(personArray[i].getId() == delId){
                for(int j = i; j < count; j++){
                    personArray[j] = personArray[j+1];
                }
                personArray[count] = null;
                return true;
            }
        }
        return false;
    }

    //5. display all graduates
    public static ArrayList displayAllGraduates(){
        ArrayList<Person> list = new ArrayList<>();
        for(int i =0; i < count; i++){
            if(graduationSet.contains(personArray[i].getId())){
                list.add(personArray[i]);
            }
        }
        return list;
    }

    //6. display all mastersstudents
    public static ArrayList displayAllMasters(){
        ArrayList<Person> list = new ArrayList<>();
        for(int i =0; i < count; i++){
            if(mastersSet.contains(personArray[i].getId())){
                list.add(personArray[i]);
            }
        }
        return list;
    }

    //7. Find Grades
    public static char findGrades(){
        char res = 'f';
        System.out.print("Enter id of student :");
        int chid = sc.nextInt();
        int a = 0;
        for (Person p : personArray){
            if(p.getId() == chid){
//                a = p.avgMarks();
            }
        }
        if(a >= 85) return  'o';
        if(a >= 70) return  'a';
        if(a >= 55) return  'b';
        if(a >= 40) return  'c';
        if(a >= 35) return 'p';

        return res;
    }



}
