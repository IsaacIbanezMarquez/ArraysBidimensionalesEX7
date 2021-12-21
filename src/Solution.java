




import java.util.Random;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        // 7. Donada una taula quadrada numèrica d'enters de dimensió n, determina si és simètrica. Una taula quadrada és simètrica si el elements simètrics respecte de la diagonal principal són iguals.
        Scanner entrada = new Scanner(System.in);

        //primer array, amplitud
        int fila;
        System.out.println("Filas: ");
        fila = entrada.nextInt();

        int col;
        System.out.println("Columnas: ");
        col = entrada.nextInt();

        int[][] A = new int[fila][col];
        int[][] B = new int[col][fila];
        System.out.println();
        System.out.println();
        System.out.println("Matriz 1");
        System.out.println();
        // valores del primer arrray
        Random r = new Random();

        for(int i = 0; i < fila; i++){
            for(int j = 0; j < col; j++){
                A[i][j] = r.nextInt(10);
                System.out.print( " "+ A[i][j] +" " );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Matriz 2");
        System.out.println();

        for(int i = 0; i < col; i++){
            for(int j = 0; j < fila; j++){
                B[i][j] = r.nextInt(10);
                System.out.print(" " + B[i][j]+ " " );
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int[][] C = new int[fila][fila];

        System.out.println("Matriz Multiplicada");

        for(int i=0;i<fila;i++)
        {
            for(int j=0;j<fila;j++)
            {
                for(int h=0;h<col;h++)
                {
                    C[i][j]+=A[i][h]*B[h][j];
                }
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }

        entrada.close();
    }
}
