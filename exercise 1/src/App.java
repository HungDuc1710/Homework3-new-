import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Tạo mảng, tạo giá trị mảng
        System.out.println("Nhập một số nguyên");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Nhập sai");
            System.exit(0);
        }
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử mảng arr[%d]:", i);
            arr[i] = scanner.nextInt();
            if (arr[i] <= 0) {
                System.out.println("Yêu cầu nhập lại");
                System.exit(0);
            }
        }
        // Xuất mảng vừa nhập ra màn hình
        xuatMang(arr);
        // Tìm min/max
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.printf("\nPhần tử lớn nhất là: %d", max);
        System.out.printf("\nPhần tử nhỏ nhất là: %d", min);
        // Tìm và đếm các số chẵn trong mảng
        int count = 0;
        System.out.println("\nCác số chẵn trong mảng là:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + "\t");
                count++;
            }
        }
        System.out.println("\nSố lượng các số chẵn trong mảng là: " + count);

        // Tìm các số nguyên tố có trong mảng
        System.out.println("\nCác số nguyên tố trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            if (kiemTraSoThuc(arr[i])) {
                System.out.print(arr[i] + "\t");
            }
        }
        // Sắp xếp mảng thứ tự tăng dần
        System.out.println("\nMảng sắp theo theo thứ tự tăng dần là: ");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        // Sắp xếp mảng theo thứ tự giảm dần
        System.out.println("\nMảng sắp theo theo thứ tự giảm dần là: ");
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
    }

    public static boolean kiemTraSoThuc(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void xuatMang(int a[]) {
        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
