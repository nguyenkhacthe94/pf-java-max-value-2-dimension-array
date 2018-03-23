import java.util.Scanner;

public class MaxValueArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int column, row;
        do {
            System.out.print("Enter amount of column: ");
            column = input.nextInt();
            if (column < 1 || column > 10) System.out.println("\n Column should not exceed 10");
        } while (column < 1 || column > 10);
        do {
            System.out.print("Enter amount of row: ");
            row = input.nextInt();
            if (row < 1 || row > 10) System.out.println("\n Row should not exceed 10");
        } while (row < 1 || row > 10);
        float array[][] = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter matrix number at " + i + ", " + j + ": ");
                array[i][j] = input.nextFloat();
            }
        }
        float max = array[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    System.out.print("\n New max value is: " + max);
                }
            }
        }
    }
}