package matrizes.exercicios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        DecimalFormat numFormat= new DecimalFormat("R$#,##0.00");

        String[] nomeLoja = new String[8];
        String[] nomeProd = new String[4];
        double[][] array = new double[4][8];

        Random r = new Random();


        for (int i = 0; i < nomeLoja.length; i++) {
            System.out.print("Informe o nome da Loja " + (i + 1) + ": ");
            nomeLoja[i] = entrada.next();
        }

        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
            System.out.print("Informe o nome do Produto  " + (i + 1) + ": ");
            nomeProd[i] = entrada.next();
        }

        System.out.println(" ");
        System.out.println("---------------- Preços dos Produtos por Loja ----------------------");
        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            System.out.println("PRODUTO: " + nomeProd[i]);
            System.out.println(" ");
            for (int j = 0; j < 8; j++) {
                array[i][j] = (Math.random() * 190);
                System.out.println("Preço do Produto " + nomeProd[i] +  "na Loja " + nomeLoja[j] + ": " +     numFormat.format(array[i][j]));
            }
        }


        System.out.println(" ");
        System.out.println("---------------- Produtos que custam menos de R$ 120,00 ------------------------");
        System.out.println(" ");

        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            System.out.println("PRODUTO: " + nomeProd[i]);
            for (int j = 0; j < 8; j++) {
                if (array[i][j]<120){
                    System.out.println("------ Loja " + nomeLoja[j] + " Preço: " + numFormat.format(array[i][j]));
                }
            }

        }



    }
}
