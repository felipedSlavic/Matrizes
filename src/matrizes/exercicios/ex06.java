package matrizes.exercicios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat formataMoeda = new DecimalFormat(" R$ ###0.00");

        //MATRIZ
        double[][] arrayPrecos = new double[5][4];
        double[][] arrayImpostos = new double[5][4];

        //VETORES
        String [] produtos = new String[]{"ARROZ","SABÃO EM PÓ","FARINHA","LEITE","DETERGENTE"};
        double [] custoTransporte = new double[5];

        //VAR
        double percImposto=0;


        //RANDOM
        Random r=new Random();

        //CARREGAR VETORES

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("PRODUTO " + (i+1) + ": " + produtos[i]);
            custoTransporte[i]=r.nextInt(30);
            System.out.println("Informe o Custo do Transporte do Produto " + (i+1) + ": " + custoTransporte[i]);
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------");
        //CARREGAR MATRIZ
        for (int p=0; p < 5; p++){
            System.out.println();
            System.out.println("PRODUTO " + (p+1) + ": " + produtos[p] );
            for (int l = 0; l < 4; l++) {
                arrayPrecos[p][l]=r.nextDouble(120);
                System.out.println("----- Preço do Produto na Loja " + (l+1) + ": " + formataMoeda.format(arrayPrecos[p][l]));


                if (arrayPrecos[p][l]<=50){
                    percImposto=0.05;
                } else if (arrayPrecos[p][l]>50 && arrayPrecos[p][l]<=100 ) {
                    percImposto=0.10;
                } else {
                    percImposto=0.20;
                }

            }
        }


        //RELATÓRIO
        System.out.println();
        System.out.println("-------------RELATÓRIO----------------");
        System.out.println();

        for (int p = 0; p < 5; p++) {
            System.out.println();
            System.out.println("PRODUTO " + (p+1) + ": " + produtos[p] );
            for (int l = 0; l < 4; l++) {
                System.out.println();
                System.out.println("----- Loja "  + (l+1) + "------");
                System.out.println("---Custo do Transporte: " + custoTransporte[p]);
                System.out.println("-----Imposto :" + formataMoeda.format((arrayPrecos[p][l]*percImposto)) );
                System.out.println("-----Preço :" + formataMoeda.format(arrayPrecos[p][l]) );
                System.out.println("-----Preço Final :" + formataMoeda.format((arrayPrecos[p][l]*percImposto)+arrayPrecos[p][l]+custoTransporte[p]));

            }

        }





















    }
}
