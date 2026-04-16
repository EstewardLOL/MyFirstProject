import java.util.Scanner;

public class nestedLoops {
    public static void main(String[] args) {

        // nested loop = a loop in a loop

        int rows;
        int columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows: ");
        rows = scanner.nextInt();

        System.out.print("Columns: ");
        columns = scanner.nextInt();

        System.out.print("Char: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
