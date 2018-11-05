//Класс Matrixes позволяет выполнять действие над объектами класса Matrix

import java.util.Scanner;

public class Matrixes {
    private static Scanner in = new Scanner(System.in);

    // заполнение матрицы из консоли
    Matrix read() {
        System.out.println("Введите размерность матрицы");
        int row = in.nextInt();
        int column = in.nextInt();
        Matrix mass = new Matrix(row, column);
        System.out.println("Введите элементы матрицы");
        for (int i = 0; i < mass.rows(); i++)
            for (int j = 0; j < mass.columns(); j++) {
                int temp = in.nextInt();
                mass.update(i, j, temp);
            }
        return mass;
    }

    // вывод матрицы в консоль
    void print(Matrix matrix) {
        for (int i = 0; i < matrix.rows(); ++i, System.out.println())
            for (int j = 0; j < matrix.columns(); ++j)
                System.out.printf(" %d", matrix.element(i, j));
    }

    // умножение матриц
    Matrix multiplication(Matrix first, Matrix second) {
        int row1 = first.rows(), col1 = first.columns(), row2 = second.rows(), col2 =
                second.columns();
        Matrix result = new Matrix(first.rows(), second.columns());
        if (col1 == row2) {
            for (int i = 0; i < row1; i++)
                for (int k = 0; k < col2; k++)
                    for (int j = 0; j < row2; j++)
                        result.update(i, k, result.element(i, k) + first.element(i, j)
                                * second.element(j, k));
            return result;
        } else
            return null;
    }
}

