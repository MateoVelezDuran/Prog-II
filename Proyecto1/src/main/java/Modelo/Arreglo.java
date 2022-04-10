package Modelo;

import java.util.Random;
import javax.swing.JOptionPane;

public class Arreglo {

    int[][] M;

    public int getM(int i, int j) {
        return M[i][j];
    }

    public int[][] getMM() {
        return M;
    }

    public void setM(int M, int i, int j) {
        this.M[i][j] = M;
    }

    public void cargar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int min = 1;
                int max = 10;

                Random random = new Random();

                M[i][j] = random.nextInt(max + min) + min;
            }
        }
    }

    public void impri() {
        String resultado = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado += M[i][j];
                resultado += " ";

            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public int[][] multiply(int[][] a, int[][] b, int[][] c) {
        if (a[0].length == 3) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                        M[i][j] = c[i][j];
                    }
                }
            }
        }
        return c;
    }

    public Arreglo() {
        M = new int[3][3];
    }

    public Arreglo(int a) {
        M = new int[3][3];
    }

    public Arreglo(int a, int b) {
        M = new int[3][3];
    }
}
