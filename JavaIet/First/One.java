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

        System.out.println("1. Insert values into arrays \n2. Get Addition of both arrays \n3. Find maxElement from both arrays \n4. Print arrays");
        System.out.println("5. Get Minimum of both arrays \n6. Get Row Sum of both \n7. Get Column Sum of both array \n8. Exit");

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
                default:
                    break;
            }
            if (opt != 8) {
                System.out.print("\nEnter your next choice: ");
                opt = sc.nextInt();
            }
        } while (opt != 8);
        if(opt == 8 ){
            System.out.println("Thank you for visiting my menu program, Have a nice day <3");
        }
    }
}
