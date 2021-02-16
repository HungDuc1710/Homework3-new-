import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Viết chương trình nhập mảng đa chiều, In mảng đó ra màn hình
         */
        System.out.println("Nhập một số nguyên dương");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Nhập vào phần tử thứ arr[" + i + "][" + j + "]");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
        }
        //Tính tổng các phần tử chia hết cho 5 trong mảng
        System.out.println("\nTổng các phần tử chia hết cho 5 trong mảng là:");
        devide5(n, arr);
    }

    public static void devide5(int n, int arr[][]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                if(arr[i][j]%5==0){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
