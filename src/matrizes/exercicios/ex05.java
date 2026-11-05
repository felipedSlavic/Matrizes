package matrizes.exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        //MATRIZES

        int[][] primeiroSem = new int[5][3];
        int[][] segundoSem = new int[5][3];
        int[][] anual = new int[5][3];


        //VETOR
        int[] vet = new int[3];
        int[] vet2 = new int[5];

        //VAR
        int maior = 0;
        int curso=0;


        Random r = new Random();

        System.out.println();
        System.out.println("----------Primeiro Semestre-----------");

        for (int u = 0; u < 3; u++) {
            System.out.println();
            System.out.println("Unidade " + (u + 1));
            for (int c = 0; c < 5; c++) {
                primeiroSem[c][u] = r.nextInt(30);
                System.out.println("Informe a quantidade de matrículas neste unidade para o curso " + (c + 1) + ": " + primeiroSem[c][u]);
            }
        }
        System.out.println();
        System.out.println("---------Segundo Semestre-------------");

        for (int u = 0; u < 3; u++) {
            System.out.println();
            System.out.println("Unidade " + (u + 1));
            System.out.println();
            for (int c = 0; c < 5; c++) {
                segundoSem[c][u] = r.nextInt(30);
                System.out.println("Informe a quantidade de matrículas neste unidade para o curso " + (c + 1) + ": " + segundoSem[c][u]);
            }
        }

        System.out.println();
        System.out.println("----------Quantidade de matrículas de cada curso por unidade no ano ---------- ");
        System.out.println();

        for (int c = 0; c < 5; c++) {
            System.out.println("Curso " + (c + 1));
            for (int u = 0; u < 3; u++) {
                anual[c][u] = primeiroSem[c][u] + segundoSem[c][u];
                System.out.println("Quantidade de Matrículas na Unidade " + (u+1) + ": " + anual[c][u]);
            }
            System.out.println();
        }


        System.out.println("-------QUANTIDADE DE MATRÍCULAS POR UNIDADE------");

        for (int u = 0; u < 3; u++) {
            System.out.println();
            System.out.println("Unidade " + (u + 1));

            for (int c = 0; c < 5; c++) {
                anual[c][u] = primeiroSem[c][u] + segundoSem[c][u];
                System.out.print(anual[c][u] + "\t");
                vet[u] += anual[c][u];
            }

            System.out.println();
            System.out.println("O total de matrículas por unidade no ano: " + vet[u]);
        }

        System.out.println();
        System.out.println("-------------QUANTIDADE DE MATRÍCULAS POR CURSO--------------");

        for (int c = 0; c < 5; c++) {
            System.out.println();
            System.out.println("Curso " + (c + 1));
            for (int u = 0; u < 3; u++) {
                System.out.print(anual[c][u] + "\t");
                vet2[c] +=anual[c][u];

                if (vet2[c] > maior) {
                    maior = vet2[c];
                    curso=c;

                }
            }
            System.out.println();
            System.out.println("O total de matrículas de cada curso no ano: " + vet2[c]);
            System.out.println();

        }

        System.out.println("-------Curso com Maior Número de Matrículas: Curso " + curso + " com " + maior + " matrículas------");


    }
}
