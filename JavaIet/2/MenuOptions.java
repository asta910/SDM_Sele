import java.util.Scanner;

class MenuOptions{
    public static void main(String[] args) {
        System.out.println("1. Create new Entry \n2. Find student By id \n3. Find students by name \n4. Show all students");
        System.out.println("5. Get Averagr marks with name \n6. Update marks by id \n7. Delete student by Id \n8. Exit. ");

        System.out.print("Enter your choice :");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        while(choice != 8){
            switch (choice) {
                case 1:
                    //create Entry
                    ArrayObject.createEntry();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                default:
                    System.out.println("Select from availabe options only");
                    break;
            }
        }
        System.out.println("Thank you for visiting ");
        sc.close();
    }
}