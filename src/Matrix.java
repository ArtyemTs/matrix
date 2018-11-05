// Класс Matrix определяет вид матрицы и определяет методы для взаимодействия с ней

public class Matrix {

    private int rows, columns;
    private  int[][] matrixBody;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrixBody = new int[this.rows][this.columns];
    }

    int rows() {
        return rows;
    }

    int columns() {
        return columns;
    }

    int element(int row, int column) {
        return matrixBody[row][column];
    }

    void update(int row, int column, int value) {
        matrixBody[row][column] = value;
    }

    int[] row(int index) {
        return matrixBody[index];
    }

    int[] column(int index) {
        int[] temp = new int[this.columns];
        for (int i = 0; i < index; i++)
            matrixBody[i][index] = temp[i];
        return temp;
    }
}
