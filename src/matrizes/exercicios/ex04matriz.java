package matrizes.exercicios;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ex04matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat formataMoeda = new DecimalFormat(" R$ ###0.00");

        double[][] precos = new double[12][5];

        char[] produtos = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};
        String[] lojas = new String[]{"Loja A", "Loja B", "Loja C", "Loja D", "Loja E"};

        double maiorPreco = 0, menorPreco = 0;
        int maiorProd = 0, menorProd = 0, maiorLoja = 0, menorLoja = 0;



        //Carregar MAtriz


        for (int p = 0; p < 12; p++) {
            System.out.println("");
            System.out.println(produtos[p]);
            for (int l = 0; l < 5; l++) {
                System.out.println("Informe o preço na " + lojas[l] + ":");
                System.out.println(precos[p][l] = (Math.random() * 200));



                //Verificar Maior e Menor

                if (p == 0 && l == 0) {  //Menor Preço (Loja e Produto)
                    menorPreco = precos[p][l];
                    menorLoja = l;
                    menorProd = p;
                } else if (precos[p][l] < menorPreco) {
                    menorPreco = precos[p][l];
                    menorLoja = l;
                    menorProd = p;
                }

                if (precos[p][l] > maiorPreco) {
                    maiorPreco = precos[p][l];
                    maiorProd = p;
                    maiorLoja = l;
                }


            } //For l
        } //For j


        System.out.println();
        System.out.println("Produto mais barato: " + produtos[menorProd]);
        System.out.println("Loja: " + lojas[menorLoja]);
        System.out.println("Preço: " + formataMoeda.format(menorPreco));
        System.out.println("Produto mais caro: "+produtos[maiorProd]);
        System.out.println("Loja: " + lojas[maiorLoja]);
        System.out.println("Preço: " + formataMoeda.format(maiorPreco));


    }
}
