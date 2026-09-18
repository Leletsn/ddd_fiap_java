package aula2;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {

        // Declaração de variaveis
        float n1, n2, n3, media;
        String nome;

        // Atribuição
        nome = "Gustavo";
        n1 = 7.8f;
        n2 = 9.5f;
        n3 = 5.5f;

        media = (n1 + n2 + n3) / 3;


//        Saida de Dados
//        System.out.println("A media é: " + media);


        Scanner lerNumero = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = lerNumero.nextFloat();

        System.out.println("Digite a primeira nota: ");
        float nota2 = lerNumero.nextFloat();

        System.out.println("Digite a primeira nota: ");
        float nota3 = lerNumero.nextFloat();


        System.out.println("----------------------------------------");

        float mediaNotas = (nota1 + nota2 + nota3) / 3;

        System.out.printf("\nA média dos números informados é: %.2f ", mediaNotas);

    }


}