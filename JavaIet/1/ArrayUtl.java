import java.util.Scanner;

public class ArrayUtl {
    //1. Insert Into array
    public static int[][] insertData(int n){
        System.out.println("For array of size "+ n*n + " Enter " + n*n  + " values ");
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[n][n];
        for(int i =0; i < n ; i++){
            for(int j =0; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    //2. Get addition
    public static int[][] getAddition(int[][] a1, int[][] a2){
        int n = Math.min(a1.length, a2.length);
        int m = Math.min(a1[0].length,a2[0].length);
        int ans[][] = new int[n][m];
        for(int i =0; i < n; i++){
            for(int j =0; j < m; j++){
                ans[i][j] = a1[i][j] + a2[i][j];
            }
        }
        return ans;
    }

    //3.Find maxElement from both arrays
    public static int findMax(int[][] a){
        int maxNum = Integer.MIN_VALUE;
        for(int[] row : a){
            for(int i : row){
                maxNum = Math.max(maxNum,i);
            }
        }
        return maxNum;
    }


    //4. Print Array
    public static void printArray(int[][] a){
        for(int i =0; i < a.length; i++){
            for(int j =0; j < a[0].length; j++){
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }
    }

    // 5. Get Minimum of both arrays
    public static int findMin(int[][] a){
        int maxNum = Integer.MAX_VALUE;
        for(int[] row : a){
            for(int i : row){
                maxNum = Math.min(maxNum,i);
            }
        }
        return maxNum;
    }

    //6. Get Row Sum of both
    public static int[] getRowSum(int[][] a){
        
        int ans[] = new int[a.length];
        for(int i =0; i < a.length; i++){
            int rowSum = 0;
            for(int j =0; j < a[0].length; j++){
                rowSum += a[i][j];
            }
            ans[i] = rowSum;
        }
        return ans;
    }

        //7. Get Column Sum of both
        public static int[] getColSum(int[][] a){
        
            int ans[] = new int[a[0].length];

            for(int i =0; i < a[0].length; i++){
                int colSum = 0;
                for(int j =0; j < a.length; j++){
                    colSum += a[j][i];
                }
                ans[i] = colSum;
            }
            return ans;
        }

        //print col & row Sum array 
        public static void sumPrint(int[] a){
            for(int i : a){
                System.out.println(i + " ");
            }
        }

        //function to check Symmetry
        public static boolean checkSym(int[][] a1, int[][] a2){
            int n1 = a1.length;
            int n2 = a2.length;
            int m1 = a1[0].length;
            int m2 = a2[0].length;
            return (n1 == n2 && m1 == m2);
        }

        
}