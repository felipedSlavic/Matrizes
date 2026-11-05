package matrizes.exemplos;

import java.util.Scanner;

public class exemplo02_matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[4][4];

        int somaLinha = 0, totalGeral=0;


        for (int i = 0; i < 4; i++) {
            somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o Valor [" + i + "," + j + "] : ");
                numeros[i][j] = entrada.nextInt();
                somaLinha += numeros[i][j];
            }//for j
            System.out.println("Soma da Linha:" + somaLinha);
            totalGeral+=somaLinha;
        }
        System.out.println("Total Geral:" + totalGeral);


    }
}
