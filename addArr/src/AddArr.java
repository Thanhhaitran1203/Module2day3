import java.util.Scanner;

public class AddArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ "+ i + " mảng 1 ");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập phần tử thứ "+ i + " mảng 2 ");
            arr2[i] = sc.nextInt();
        }
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < arr1.length){
                newArr[i] = arr1[i];
            }else{
                newArr[i] = arr2[i - arr1.length];
            }
        }
        System.out.printf("\n%-20s%s","mảng mới là ","");
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf(newArr[i] + "\t");
        }
    }
}