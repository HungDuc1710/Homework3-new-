
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Viết chương trình nhập vào 2 ma trận vuông A và B
        System.out.println("Nhập vào 1 số nguyên dương:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        // Nhập vào ma trận A,B
        System.out.println("Ma trận A");
        nhapMang(n, A);
        System.out.println("Ma trận B");
        nhapMang(n, B);
        // Xuất ra ma trận A,B
        System.out.print("\nMa trận A vừa nhập là:");
        xuatMang(n, A);
        System.out.print("\nMa trận B vừa nhập là:");
        xuatMang(n, B);

        //Thực hiện cộng hai ma trận
        System.out.println("\nTổng hai ma trận là:");
        int C[][] = new int[n][n];
        for(int i = 0; i< n;i++){
            for(int j = 0; j< n; j++){
                C[i][j]= A[i][j]+B[i][j];                 
            }
        }
        xuatMang(n, C);

        //Tìm ma trận chuyển vị của 2 ma trận
        System.out.println("\nMa trận chuyển vị của A là: ");
        transpose(n, A);
        xuatMang(n, A);
        System.out.println("\nMa trận chuyển vị của B là: ");
        transpose(n, B);
        xuatMang(n, B);
    }

    public static void nhapMang(int n, int arr[][]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("Nhập vào phần tử arr[%d][%d]:\n", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xuatMang(int n, int arr[][]) {
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] +"\t");
            }
        }
    }
    public static void transpose(int n, int arr[][]){
        int temp =0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}