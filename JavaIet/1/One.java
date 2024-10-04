import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and columns of array 1 ");
        int a1 = sc.nextInt();
        System.out.println("Enter row and columns of array 2 ");
        int a2 = sc.nextInt();
        System.out.println("Array 1 : ");
        int[][] array1 = ArrayUtl.insertData(a1);
        System.out.println("Array 2 : ");
        int[][] array2 = ArrayUtl.insertData(a2);

        System.out.println(
                "1. Insert values into arrays \n2. Get Addition of both arrays \n3. Find maxElement from both arrays \n4. Print arrays");
        System.out.println(
                "5. Get Minimum of both arrays \n6. Get Row Sum of both \n7. Get Column Sum of both array \n8. Check Symmetry of both arrays \n9.Change dimensions of array \n10. Exit");

        System.out.print("Enter your choice :");
        int opt = sc.nextInt();
        do {
            switch (opt) {

                case 1:
                    System.out.println("Array 1 : ");
                    array1 = ArrayUtl.insertData(a1);
                    System.out.println("Array 2 : ");
                    array2 = ArrayUtl.insertData(a2);
                    break;

                case 2:
                    int ans[][] = ArrayUtl.getAddition(array1, array2);
                    ArrayUtl.printArray(ans);
                    break;

                case 3:
                    int m1 = ArrayUtl.findMax(array1);
                    System.out.print("Max element in Array 1 : " + m1);
                    int m2 = ArrayUtl.findMax(array2);
                    System.out.print("Max element in Array 2 : " + m2);
                    break;

                case 4:
                    System.out.println("Array 1 : ");
                    ArrayUtl.printArray(array1);
                    System.out.println("Array 2 : ");
                    ArrayUtl.printArray(array2);
                    break;

                case 5:
                    int min1 = ArrayUtl.findMin(array1);
                    System.out.print("Min element in Array 1 : " + min1);
                    int min2 = ArrayUtl.findMin(array2);
                    System.out.print("Min element in Array 2 : " + min2);
                    break;

                case 6:
                    System.out.println("For array 1 row sum is : ");
                    int[] rs1 = ArrayUtl.getRowSum(array1);
                    ArrayUtl.sumPrint(rs1);

                    System.out.println("For array 2 row sum is : ");
                    int[] rs2 = ArrayUtl.getRowSum(array2);
                    ArrayUtl.sumPrint(rs2);

                    break;

                case 7:
                    System.out.println("For array 1 column sum is : ");
                    int[] cs1 = ArrayUtl.getColSum(array1);
                    ArrayUtl.sumPrint(cs1);

                    System.out.println("For array 2 column sum is : ");
                    int[] cs2 = ArrayUtl.getColSum(array2);
                    ArrayUtl.sumPrint(cs2);
                    break;

                case 8:
                    boolean res = ArrayUtl.checkSym(array2, array1);
                    if (res) {
                        System.out.println("Both arrays are symmetric ");
                    } else {
                        System.out.println("Both arrays have diffrent dimensions ");
                    }
                    break;
                case 9:
                    System.out.println("1. For first Array only");
                    System.out.println("2. For second Array only");
                    System.out.println("3. Change both");
                    System.out.println("4. Done changing");
                    System.out.print("Select your choice: ");
                    int change = sc.nextInt();

                    while (change != 4) {
                        switch (change) {
                            case 1:
                                System.out.println("Enter rows and columns of array 1: ");
                                int new1 = sc.nextInt();
                                array1 = ArrayUtl.insertData(new1); 
                                break;
                            case 2:
                                System.out.println("Enter rows and columns of array 2: ");
                                int new2 = sc.nextInt();
                                array2 = ArrayUtl.insertData(new2);
                                break;
                            case 3:
                                System.out.println("Enter rows and columns of array 1: ");
                                int newRows1 = sc.nextInt();
                                array1 = ArrayUtl.insertData(newRows1);
                                System.out.println("Enter rows and columns of array 2: ");
                                int newRows2 = sc.nextInt();
                                array2 = ArrayUtl.insertData(newRows2);
                                break;
                            default:
                                System.out.println("Incorrect input, please select available options only...");
                                break;
                        }

                        System.out.println("1. For first Array only");
                        System.out.println("2. For second Array only");
                        System.out.println("3. Change both");
                        System.out.println("4. Done changing");
                        System.out.print("Select your choice: ");
                        change = sc.nextInt(); 
                    }
                        System.out.println("Arrays are up to date.");
                        break;
            }

            if (opt != 10) {
                System.out.println();
                System.out.println(
                    "1. Insert values into arrays \n2. Get Addition of both arrays \n3. Find maxElement from both arrays \n4. Print arrays");
            System.out.println(
                    "5. Get Minimum of both arrays \n6. Get Row Sum of both \n7. Get Column Sum of both array \n8. Check Symmetry of both arrays \n9.Change dimensions of array \n10. Exit");
    
            System.out.print("Enter your choice :");
                opt = sc.nextInt();
            }


        } while (opt != 10);
        if (opt == 10) {
            System.out.println("Thank you for visiting my menu program, Have a nice day <3");
        }
        sc.close();
    }
}