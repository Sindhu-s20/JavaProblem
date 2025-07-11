import java.util.Scanner;
//OddNumberSeries
public class Problem2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int a = scanner.nextInt();
        int num = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(num);
            if (i < a - 1) {
                System.out.print(", ");
            }
            num += 2;
        }
    }
}