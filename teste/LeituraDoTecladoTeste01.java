package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entraga = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        System.out.print("-> ");
        String nome = entraga.nextLine();

        System.out.println("Digite sua idade");
        System.out.print("-> ");
        int idade = entraga.nextInt();

        System.out.println("Digite M ou F para seu sexo");
        System.out.print("-> ");
        char sexo = entraga.next().charAt(0);

        System.out.println("--------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
