import java.util.Scanner;
  public class Problem3  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int a = scanner.nextInt();
        int count = (a % 2 == 0) ? a - 1 : a; // Use previous number if a is even

        for (int i = 0; i < count; i++) {
            System.out.print((2 * i + 1));
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }
}

