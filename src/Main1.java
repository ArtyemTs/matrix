//

public class Main1 {
    public static void main(String[] args) {

        Matrixes matrixes = new Matrixes();
        Matrix first = matrixes.read();
        Matrix second = matrixes.read();

        Matrix multiplication = matrixes.multiplication(first, second);
        if (multiplication == null)
            System.out.println("Эти матрицы не могут быть умножены");
        else
            matrixes.print(multiplication);
    }
}
