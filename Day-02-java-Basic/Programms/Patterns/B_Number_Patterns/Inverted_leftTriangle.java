import java.util.Scanner;

class Inverted_leftTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row");
        int row = sc.nextInt();

        System.out.println("Enter your column");
        int column = sc.nextInt();

        for (int i = row; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}