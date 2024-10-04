import java.util.Scanner;

public class Manu {
    public static void main(String[] args) {
        System.out.println(" 1. Create new Entry \n 2. Find student By id \n 3. Find students by name \n 4. Show all students");
        System.out.println(" 5. Get Averagr marks with name \n 6. Update marks by id \n 7. Delete student by Id \n 8. Total Number of students \n 9. Sort By Average Marks \n10. Exit.. ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Select your option : ");
        int choice = sc.nextInt();

        while(choice != 10){

            switch (choice) {

                case 1:
                    boolean res = Operations.newEntry();
                    if(res){
                        System.out.println("Operation Successfull...");
                    }else{
                        System.out.println("Operation Failed...");
                    }
                    break;

                case 2:

                    Student std = Operations.findStudentById();
                    if(std != null){
                        System.out.println(std);
                    }else{
                        System.out.println("Student not found ");
                    }
                    break;

                case 3:
                    Student[] ans = Operations.findStudentByName();
                    if(ans != null) {
                        for (Student s : ans) {
                            System.out.println(s);
                        }

                    }else {
                        System.out.println("No student found with this name");
                    }
                    break;

                case 4:
                    System.out.println("Students are : ");
                    Student[] show = Operations.showAllStudents();
                    if(show != null) {
                        for (Student s : show) {
                            System.out.println(s);
                        }
                    }else {
                        System.out.println("No student found in record");
                    }
                    break;

                case 5:
                        Operations.marksAvg();
                    break;

                case 6:
                    boolean resMarks = Operations.updateMarksById();
                    if(resMarks){
                        System.out.println("Updated marks successfully");
                    }else{
                        System.out.println("No student with this id ");
                    }
                    break;

                    case 7:
                        boolean delRes = Operations.deleteStudent();
                        if(delRes){
                            System.out.println("Deleted student successfully");
                        }else{
                            System.out.println("No student found with this id");
                        }
                    break;

                case 8 :

                    int count = Operations.GetCountOfStudents();
                    if(count == 0 ) System.out.println("No student availabe in record");
                    else System.out.println("Total students are : " + count );
                    break;

                case 9 :
                    boolean sortRes = Operations.sortByAverageMarks();
                    if(!sortRes){
                        System.out.println("No student found in record");
                    }
                    break;

                default:
                    System.out.println("Only 10 options available ");
                    break;
            }
            System.out.print("Select your option : ");
            choice = sc.nextInt();
        }

        System.out.println("Thank you..");
        sc.close();
        System.exit(0);
    }
}
