import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = null;
        int row, column;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dòng cho mảng: ");
        row = scanner.nextInt();
        System.out.println("Nhập cột cho mảng: ");
        column = scanner.nextInt();
        array = new int[row][column];

        //Nhập phần tử cho ma trận.
        System.out.println("Nhập phần tử cho ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int sumRow = 0;
        int sumColumn = 0;
        int x = 0;
        System.out.println("Nhập dòng cần tính: ");
        int indexRow = scanner.nextInt()-1;
        System.out.println("Nhập cột cần tính: ");
        int indexColumn = scanner.nextInt()-1;
        System.out.print("Tổng dòng thứ " + (indexRow+1) + " = ");
        for (int j = 0; j < column; j++) {
            sumRow += array[indexRow][j];
        }
        System.out.println(sumRow);
        System.out.print("Tổng cột thứ "+ (indexColumn+1) + "= ");
        for (int j = 0; j < column; j++) {
            sumColumn += array[j][indexColumn];
        }
        System.out.println(sumColumn);

    }
}
