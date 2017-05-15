package Array;

public class EjercicioMatriz {

    public static void main(String args[]) {

        //Dada la siguiente matriz
        int[][] m = {{1,4,5,7}, {2,3,5,8}, {0,9,2,7}, {3,5,1,2}};

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
