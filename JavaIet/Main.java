package Five_Oct_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("1. Add student \n2. Show All \n3. Update marks \n4. Delete student \n5. Display All graduates \n6. Show All Master Students \n7. Find Grades \n8. Exit... " );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        while(choice!=8) {

            switch (choice){
                case 1:
                    if(Operations.addStudent()){
                        System.out.println("Added Successfully..");
                    }else{
                        System.out.println("Operation Failed..");
                    }
                    break;
                case 2:
                    Person[] ans = Operations.showAllPeopels();
                    for (Person person : ans){
                        System.out.println(person);
                    }
                    break;
                case 3:
                    boolean marksRes = Operations.updateMarks();
                    if (marksRes){
                        System.out.println("Marks updated successfully..");
                    }else{
                        System.out.println("Oprtation failed..");
                    }
                    break;
                case 4:
                    boolean delRes = Operations.deleteStudent();
                    if (delRes){
                        System.out.println("Student deleted successfully..");
                    }else{
                        System.out.println("Oprtation failed..");
                    }
                    break;
                case 5:
                    ArrayList<Person> ansList = new ArrayList<>();
                    for (Person p : ansList){
                        System.out.println(p);
                    }
                    break;
                case 6:
                    ArrayList<Person> ansList2 = new ArrayList<>();
                    for (Person p : ansList2){
                        System.out.println(p);
                    }
                    break;
                case 7:
                    char gradeResult = Operations.findGrades();
                    System.out.println("Grades of student are : "+ gradeResult);

                    break;
                default:
                    System.out.println("Only 8 options are available");
                    break;
            }
            System.out.println("1. Add student \n2. Show All \n3. Update marks \n4. Delete student \n5. Display All graduates \n6. Show All Master Students \n7. Find Grades \n8. Exit... " );
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
        }

        sc.close();
        System.out.println("Thank you..");
    }

}
