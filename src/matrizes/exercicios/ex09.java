package matrizes.exercicios;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //MATRIZES

        double [][] matriz1 = new double[3][3];
        double [][] matriz2 = new double[3][3];
        double [][] matrizResultante = new double[3][4];



        //Processamento
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Digite o valor para a Matriz 1: ");
                matriz1[l][c] = entrada.nextDouble();
            }
        }

        System.out.println(" ");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Digite o valor para a Matriz 2: ");
                matriz2[l][c] = entrada.nextDouble();
            }
        }


        //LETRA A
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matrizResultante[l][c]= matriz1[l][c] + matriz2[l][c];

                System.out.print(matrizResultante[l][c] + "\t");
            }
            System.out.println();
        }





    }
}
