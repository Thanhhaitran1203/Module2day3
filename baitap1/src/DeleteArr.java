import java.util.Scanner;
public class DeleteArr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("độ dài của mảng:");
        int leng = sc.nextInt();
        for (int i = 0; i < leng; i++) {
            System.out.println("Phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập vào thằng cần xóa");
        int num = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                index = i;
                break;
            }
        }
        for (int j = index; j < arr.length - 1; j++) {
        arr[j] = arr[j + 1];
        }
        System.out.printf("\n%-20s%s", "new array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}