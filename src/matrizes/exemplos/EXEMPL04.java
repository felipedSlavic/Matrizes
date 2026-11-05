package matrizes.exemplos;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class EXEMPL04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double [][] valores = new double[5][2];
        int [][] numeros = new int[5][2];


        for (int p = 0; p < 5; p++) { //For P de Produtos

            System.out.println("Digite o Còdigo: ");
            numeros[p][0] = entrada.nextInt();
            System.out.println("Digite o Preço: ");
            valores[p][0] = entrada.nextDouble();
            System.out.println("Digite a Quantidade");
            numeros[p][1] = entrada.nextInt();


            valores[p][1]=valores[p][0] * numeros[p][1];

        }

        System.out.println("");
        System.out.println("Listagem de Produtos: ");
        System.out.println();

        for (int p = 0; p < 5; p++) {
            System.out.println(numeros[p][0] + " - " +   valores[p][0] + " - " +   numeros[p][1] + " - " +  valores[p][1]);

        }




    }
}
