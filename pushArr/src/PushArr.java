import java.util.Scanner;

public class PushArr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("độ dài của mảng:");
        int leng = sc.nextInt();
        for (int i = 0; i < leng; i++) {
            System.out.println("Phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập số cần chèn");
        int num = sc.nextInt();
        System.out.println("Nhập vị trí muốn chèn");
        int index = sc.nextInt();
        for (int i = arr.length -1; i > index; i--) {
            arr[i] = arr[i -1];
        }
        arr[index] = num;
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}