import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Viết chương trình nhập n, sau đó in ra màn hình mảng đó
        System.out.println("Nhập vào một số nguyên dương bất kỳ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Nhập sai, yêu cầu nhập lại số nguyên dương");
            System.exit(0);
        }
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ arr[" + i + "]:");
            arr[i] = scanner.nextInt();
            if (arr[i] <= 0) {
                System.out.println("Nhập sai, yêu cầu nhập lại");
                System.exit(0);
            }
        }
        System.out.println("Mảng đã nhập là:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        // Sắp xếp phần tử mảng theo thứ tự giảm dần
        int temp = 0;
        System.out.println("\nCác phần tử được sắp xếp giảm dần:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        // Tìm phần tử lớn nhất và lớn thứ hai
        int lonNhat = 0, lonThuHai = 0;
        System.out.println("\nPhần tử lớn nhất là:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lonNhat) {
                lonNhat = arr[i];
            }
        }
        System.out.print( lonNhat + "\n");
        System.out.println("\nPhần tử lớn thứ hai là:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lonThuHai && arr[i] != lonNhat)
                lonThuHai = arr[i];

        }
        System.out.print(lonThuHai + "\n");
    }
}
