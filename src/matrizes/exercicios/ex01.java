package matrizes.exercicios;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);


        int[][] numeros = new int[4][5];


        for (int c = 0; c < 4; c++) {
            System.out.print("");
            System.out.print("Digite o Código do " + (c+1) + "° cliente: ");
            numeros[c][0]= entrada.nextInt();

            System.out.print("Digite sua Quantidade de Milhas: ");
            numeros[c][1]= entrada.nextInt();

            System.out.print("Digite a Categoria: ");
            numeros[c][2]= entrada.nextInt();

            while (numeros[c][2] != 1 && numeros[c][2] !=2 && numeros[c][2] !=3){
                System.out.print("Digite um código válido (1,2 ou 3) : ");
                numeros[c][2]= entrada.nextInt();
            }


            if (numeros[c][2]==1){
                numeros[c][3]=10000;
            } else if (numeros[c][2]==2){
                numeros[c][3]=5000;
            } else {
                numeros[c][3]=0;
            }


            numeros[c][4]=  numeros[c][1] + numeros[c][3];


            System.out.println("");
        } //Fecha for

        System.out.println("");
        System.out.println("Listagem");

        for (int c = 0; c < 4; c++) {
            System.out.println("");

            System.out.println("Código do Cliente: " +    numeros[c][0] + " - Quantidade de Milhas:  " +  numeros[c][1] + " - Categoria: " +   numeros[c][2]
            + " - Bônus:  " + numeros[c][3] + " - Milhagem Atual: " +  numeros[c][4] );

        }

    }
}
