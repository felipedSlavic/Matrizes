package matrizes.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat  numFormatado = new DecimalFormat("###0.00");

        //VETOR

        String [] cidades = new String[]{"Campinas","Bauru","Sorocaba","Atibaia","Santos"};

        //MATRIZ

        double [][] distanciaCidades = new double[5][5];

        // VAR
        double consumoCombustivel = 0;
        double qtdCombustível = 0;


        //Processamento

        System.out.println("-------Cidades----------");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cidade N°" + (i+1) + ": " + cidades[i]);
        }
        System.out.println("");
        System.out.println("------------Distancia entre cidades---------");
        System.out.println("");

        for (int linha = 0; linha < 5; linha++) {

            for (int coluna =0; coluna < 5; coluna++) {
                if (linha==coluna){
                    distanciaCidades[linha][coluna] = 0;
                }
                else {
                    System.out.print("Informe a distância entre a cidade de (" + cidades[linha] + ") e a cidade de ("
                            + cidades[coluna] + ") : ");
                    distanciaCidades[linha][coluna]= entrada.nextDouble();
                }
            }
        }

        System.out.println("Informe o consumo do combustível do Veículo: ");
        consumoCombustivel= entrada.nextDouble();


        System.out.println("------- Percursos Inferiores a 250 KM -------");
        for (int linha = 0; linha < 5; linha++){
            for (int coluna = 0; coluna < 5; coluna++){

                if (linha==coluna){
                    distanciaCidades[linha][coluna] = 0;
                } else if (distanciaCidades[linha][coluna] < 250){
                    System.out.println("-- Distância: " + (distanciaCidades[linha][coluna]) + " Km - entre a cidade de (" + cidades[linha] + ") e a cidade de ("
                            + cidades[coluna] + ") : " );
                }

            }
        }

        System.out.println("");
        System.out.println("-----Consumos por Percurso--------");
        System.out.println("");


        for (int linha = 0; linha < 5; linha++){
            for (int coluna = 0; coluna < 5; coluna++) {

                if (linha != coluna) {
                    qtdCombustível = distanciaCidades[linha][coluna] / consumoCombustivel;
                    System.out.println("Consumo entre a cidade (" + cidades[linha] + ") e (" + cidades[coluna] + ") :  \t"  +
                            numFormatado.format(qtdCombustível) + " LITROS");
                }
            }

        }






    }
}
