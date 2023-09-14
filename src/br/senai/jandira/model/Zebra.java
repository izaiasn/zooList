package br.senai.jandira.model;

import java.util.Scanner;

public class Zebra {
    String nome, apelido;
    int idade;

    Scanner teclado = new Scanner(System.in);
    public void cadastroZebra(){

        System.out.println("----------Zebra----------");
        System.out.println("Informe o nome: ");
        nome = teclado.nextLine();
        System.out.println("Informe o apelido: ");
        apelido = teclado.nextLine();
        System.out.println("Informe o idade: ");
        idade = teclado.nextInt();
        teclado.nextLine();
        System.out.println("--Cadastro finalizado!--");
    }

}
