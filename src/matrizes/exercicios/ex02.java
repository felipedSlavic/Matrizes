package matrizes.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double [][] array = new double[2][2];
        double [][] matrizR = new double[2][2];
        double maior=0;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("INFORME UM NÚMERO M [" + (i+1) + "," + (j+1) + "] : ");
                array[i][j] = entrada.nextDouble();

                if (array[i][j]>maior) {
                    maior=array[i][j];
                }

            }


        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

              matrizR[i][j] = array[i][j] * maior;

                System.out.println("Resultado - Matriz R [" + (i+1) + "," + (j+1) + "] :" + matrizR[i][j]);

            }
        }

    }

}
