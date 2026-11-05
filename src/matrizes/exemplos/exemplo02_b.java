package matrizes.exemplos;

import java.util.Scanner;

public class exemplo02_b {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[4][4];
        int somaLinha = 0;
        int somaColuna=0;


        //carregar

        for (int i=0; i<4; i++){ //for que congela
            for (int j=0; j<4; j++){ //for que movimenta
                System.out.println("Digite o elemento [" + i + "," +j + "] :");
                numeros[i][j]= entrada.nextInt();

            }
        }


        for (int i = 0; i < 4; i++) {
            somaLinha=0;
            somaColuna=0;
            for (int j = 0; j < 4; j++) {
                somaLinha+=numeros[i][j]; //Congela a linha e movimenta as colunas com j
                somaColuna+=numeros[j][i]; //J movimenta as linhas e i congela a coluna
            }
            System.out.println("Soma da linha " + i + " :" + somaLinha);
            System.out.println(" ");
            System.out.println("Soma da coluna " + i + ": " + somaColuna);
        }











    }
}
