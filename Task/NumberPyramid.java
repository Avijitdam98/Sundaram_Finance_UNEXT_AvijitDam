package assignment;

public class NumberPyramid {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = rows - i; j >= 1; j--) {
                System.out.print("  ");
            }

            // Print numbers in ascending order
            for (int k = 1; k <= i; k++) {
                System.out.printf("%2d", k);
            }

            // Print numbers in descending order
            for (int l = i - 1; l >= 1; l--) {
                System.out.printf("%2d", l);
            }

            System.out.println();
        }
    }
}