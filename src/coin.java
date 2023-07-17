import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class coin {
    public static void main(String[] args) {
        int start = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter N value");
        int n=sc.nextInt();
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sumOfRows = (mid * (mid + 1L)) / 2;

            if (sumOfRows == n) {
                System.out.println(mid);
            } else if (sumOfRows > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(end);
    }
}
