package br.senai.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    List<Zebra> listZebra = new ArrayList<>();

    public void menu(){

        boolean continuar = true;


        while (continuar) {
            System.out.println("-/-/-//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
            System.out.println("-                                    -");
            System.out.println("-            Menu                    -");
            System.out.println("-                                    -");
            System.out.println("-      1 Cadastrar Zebra             -");
            System.out.println("-      2 Listar Zebra                -");
            System.out.println("-      3 Listar Zebra                -");
            System.out.println("-                                    -");
            System.out.println("-/-/-//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");

            Scanner teclado = new Scanner(System.in);
            Zebra objZebra = new Zebra();

            int opcaoUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoUsuario) {
                case 1: objZebra.cadastroZebra();
                adicionaZebra(objZebra);
                    System.out.println(listZebra.size());
                    break;

                case 2:
                    listarZebra();
                    break;

                case 3:
                    continuar = false;
                    break;
            }
        }



    }
    public void adicionaZebra(Zebra zebra){
        listZebra.add(zebra);


    }

    public void listarZebra( ){

        for ( Zebra zebra: listZebra){
            System.out.println("Nome da Zebra: "+ zebra.nome);
            System.out.println("Apelido: "+ zebra.apelido);
            System.out.println("Idade: "+ zebra.idade);
        }
    }
}
