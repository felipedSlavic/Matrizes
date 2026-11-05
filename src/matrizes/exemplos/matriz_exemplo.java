package matrizes.exemplos;

import java.util.Scanner;

public class matriz_exemplo {

    public static void  main(String [] args){

        Scanner entrada= new Scanner(System.in);

        //VETOR
        //double [] numeros = new double[5];

        //MATRIZ
        double [][] numeros = new double[3][3];

        for (int linha=0; linha<3;linha++){ //congela
            for (int coluna = 0; coluna < 3; coluna++) { //movimenta

                System.out.print("Digite o elemnto da matriz - linha " + linha + "-coluna " + coluna + ":");
                numeros[linha][coluna]=entrada.nextDouble();

            }
        }


        //Exibir MATRIZ
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Matriz[" + i + "," + j + "]" + numeros[i][j]);

            }
        }

//Exibir Formato Matriz
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + "\t");

            }
            System.out.println(" ");
        }





    }
}
