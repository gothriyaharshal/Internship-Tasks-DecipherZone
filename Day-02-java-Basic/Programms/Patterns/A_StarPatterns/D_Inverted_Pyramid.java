import java.util.Scanner;

class D_Inverted_Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row");
        int row = sc.nextInt();

        System.out.println("Enter your column");
        int column = sc.nextInt();

        for (int i = row; i >= 1; i--) {
//spaces printing first
            for (int space = 1; space <= row - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}