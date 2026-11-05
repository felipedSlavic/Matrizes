package matrizes.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat num2 = new DecimalFormat("#0");

        //MATRIZ

        double[][] estoque = new double[5][3];

        //Vetor (Este vetor é para somar as linhas do armázem)

        double[] somaArmazem = new double[4];
        double [] totalProduto = new double[3];
        double [] custoArm = new double[4];

        //VAR
        double maiorProd2 = 0, indProd2 = 0, menorEstoque = 0, menorInd = 0;

        System.out.println(" ");
        System.out.println("------- RELATÓRIO ESTOQUE -------");

        for (int l = 0; l < 4; l++) {
            System.out.println(" ");
            System.out.println("--- Estoque no armázem ( " + (l + 1) + " ) ---");
            for (int c = 0; c < 3; c++) {
                System.out.print("--- Informe a quantidade em estoque do Produto ( " + (c + 1) + " ) : ");
                estoque[l][c] = entrada.nextDouble();
            }
        }

        // CARREGAR O CUSTO (ULTÍMA LINHA DA MATRIZ)

        System.out.println(" ");
        System.out.println("------- CUSTO DE CADA PRODUTO -------");

        for (int c = 0; c < 3; c++) {
            System.out.print("--- Informe o custo do Produto (" + (c + 1) + ") : ");
            estoque[4][c] = entrada.nextDouble();
        }

        System.out.println(" ");
        System.out.println("------------------");
        //Letra A)
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 3; c++) {
                somaArmazem[l] += estoque[l][c];
            }

            System.out.println("--- Estoque no armázem (" + (l + 1) + ") : " + somaArmazem[l]);
        }

        //LETRA B) maior qtd do prod 2
        for (int l = 0; l < 4; l++) {
            if (estoque[l][1] > maiorProd2) {
                maiorProd2 = estoque[l][1];
                indProd2 = l;
            }
        }
        System.out.println(" ");
        System.out.println("---------ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ----------");
        System.out.println("--- Armazém (" + (num2.format(indProd2 + 1)) + ") - Quantidade em estoque: " + maiorProd2);

        //LETRA C)
        for (int l = 0; l < 4; l++) {

            if (l == 0) {
                menorEstoque  = somaArmazem[l];
                menorInd = l;
            } else if (somaArmazem[l] < menorEstoque){
                menorEstoque = somaArmazem[l];
                menorInd=l;
            }
        }
        System.out.println(" ");
        System.out.println("--------- ARMAZÉM COM MENOR ESTOQUE --------- ");
        System.out.println("--- Armazém (" + (num2.format(menorInd + 1)) + ") - Quantidade Total em estoque: " + menorEstoque);


        //LETRA D)
        System.out.println();
        System.out.println("------- CUSTO TOTAL DE CADA PRODUTO --------");
        System.out.println();
        for (int c = 0; c < 3; c++) {
            for (int l = 0; l < 4; l++) {
                totalProduto[c]+=estoque[l][c];
            }
            System.out.println("Custo total do produto (" + (c+1) + "): " + (totalProduto[c] * estoque[4][c]));
        }


        //LETRA E)
        System.out.println();
        System.out.println("------- CUSTO TOTAL DE CADA ARMAZÉM --------");
        System.out.println();

        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 3; c++) {
                custoArm[l] += estoque[l][c] * estoque[4][c];

                // OUTRO JEITO:
                // custoArm[l]= (estoque[l][0]*estoque[4][0]) + (estoque[l][1]*estoque[4][1]) + (estoque[l][2]*estoque[4][2]);

            }
            System.out.println("Custo total no armazém (" + (l+1) + ") : " + custoArm[l]);
        }


    }
}
