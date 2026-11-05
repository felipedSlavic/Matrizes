package matrizes.exemplos;

import java.util.Scanner;

public class exemplo03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double [][] notas = new double[3][4];


        for (int a = 0; a < 3; a++) {
            System.out.println("Aluno " + (a+1));
            for (int n = 0; n < 3; n++) {
                System.out.println("Digite a " + (n+1) + "° nota :");
                notas[a][n]=entrada.nextDouble();
                notas[a][3]+=notas[a][n];  //SOMA AS TRES NOTAS DO ALUNO E ARMAZENA NA UlTIMA RAIZ

            }
            notas[a][3]=notas[a][3]/3;
        }


        //Listagem de Médias
        System.out.println("");
        System.out.println("Listagem de Alunos média");
        System.out.println("");
        for (int a=0; a<3; a++){  //PRECISA DE APENAS UM FOR PARA AS LINHAS; A COLUNA (MÉDIA) É FIXA [3]
            System.out.println("Aluno " + (a+1) + "- Média: " + notas[a][3]);
        }

    }
}
