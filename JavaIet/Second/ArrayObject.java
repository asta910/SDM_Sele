import java.util.Scanner;

public class ArrayObject {
    static Student[] arr;
    static int ctn;
    static Scanner sc = new Scanner(System.in); // Declare Scanner as static to use in static methods

    static {
        ctn = 0;
        arr = new Student[100];
        arr[ctn++] = new Student(1, "Mohan", 80, 70, 99);
        arr[ctn++] = new Student(2, "Manish", 60, 70, 80);
        arr[ctn++] = new Student(3, "Money", 100, 100, 100);
    }
    
    // Create Entry
    static void createEntry() {
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks1: "); 
        int m1 = sc.nextInt();

        System.out.print("Enter marks2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks3: ");
        int m3 = sc.nextInt();
        arr[ctn++] = new Student(id, name, m1, m2, m3);

        if(arr[ctn -1 ] != null){
            System.out.println("Student entered succesfully");
        }else{
            System.out.println("Cannot create entry");
        }
    }

}
