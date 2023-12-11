import java.util.Scanner;

public class FindMinArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print ("Nhập chiều dài ");
        int size1 = sc.nextInt ();
        System.out.print ("Nhập chiều rộng ");
        int size2 = sc.nextInt ();
        int[][] arr = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println ("Nhập vào phần từ thứ " + i + " " + j);
                arr[i][j] = sc.nextInt ();
            }
        }
        int min = arr[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println ("min = " + min + " index " + index1 + " " + index2);

    }
}