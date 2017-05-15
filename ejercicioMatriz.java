package Array;

public class EjercicioMatriz {

    public static void main(String args[]) {

        //Dada la siguiente matriz
        int[][] m = new int[4][4];

        m[0][0] = 1;
        m[0][1] = 4;
        m[0][2] = 5;
        m[0][3] = 7;

        m[1][0] = 2;
        m[1][1] = 3;
        m[1][2] = 5;
        m[1][3] = 8;

        m[2][0] = 0;
        m[2][1] = 9;
        m[2][2] = 2;
        m[2][3] = 7;

        m[3][0] = 3;
        m[3][1] = 5;
        m[3][2] = 1;
        m[3][3] = 2;

        //Imprimir el contenido de la matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.println(m[i][j] + "\n");
            }

        }

        //Contar el número de elementos pares e impares que forma la matriz
        int contadorP = 0;
        int contadorI = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] % 2 == 0 || m[i][j] == 00) {
                    contadorP++;
                } else {
                    contadorI++;
                }
            }
        }
        System.out.println("Cantidad de pares: " + contadorP);
        System.out.println("Numero de impares: " + contadorI);

        //Determinar la sumatoria de los elementos de cada fila      
        for (int i = 0; i < m.length; i++) {
            int sumatorio = 0;
            for (int j = 0; j < m[0].length; j++) {
                sumatorio = sumatorio + m[i][j];
            }
            System.out.println("El sumatorio de la fila " + (i + 1) + " es: " + sumatorio);

        }

        //Determinar el sumatorio de la diagonal principal 
        int sumatorio = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j) {
                    sumatorio = sumatorio + m[i][j];
                }
            }
        }
        System.out.println("El sumatorio de la diagonal principal es: " + sumatorio);

    }
}
