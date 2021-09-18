package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 1. Crie um programa para gerenciar uma lista de produtos de um estabelecimento,
        //   cada produto tem um nome e um preço. No final do programa, o usuário deve decidir
        //  se irá adicionar mais de um produto,
        //  exibir todos os produtos cadastrados ou excluir um produto pelo nome.

        Map<String, String> lista_preço = new HashMap<String, String>();

        Scanner leitor = new Scanner(System.in);


        boolean menu = true;
        // int opcao=0;


        while (menu == true) {
            System.out.println("Supermercado mais Barato");
            System.out.println("\n");
            System.out.println("1- Ver lista de produtos e seus valores");
            System.out.println("2- Adicionar produtos ");
            System.out.println("3- Excluir produtos ");
            System.out.println("4- Fechar Programa");
            System.out.println("Digite o número correspondente a sua opção: ");
            int opcaoEscolhida = leitor.nextInt();
            leitor.nextLine();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("A lista de produtos tem " + lista_preço.size() + " produtos");
                    System.out.println("\n");

                    for (String chave_nome:lista_preço.keySet()) {
                        System.out.println(lista_preço.get(chave_nome));


                    }



                    break;
                case 2:
                    System.out.println("Digite o nome do novo produto:");
                    String nome_produto = leitor.nextLine();
                    System.out.println("Digite o valor do produto:");
                    String valor_produto = leitor.nextLine();

                    lista_preço.put(nome_produto, "Nome: " + nome_produto +  " Preço: " + valor_produto );


                    System.out.println("Produto Adicionado Com Sucesso");
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Digite o nome do produto que você deseja excluir:");
                    String exclusao= leitor.nextLine();

                    for (String chave_nome:lista_preço.keySet()) {
                        if(chave_nome.equals(exclusao)){
                            System.out.println("Produto Removido");
                        }

                    }

                    lista_preço.remove(exclusao);
                    break;
                case 4:

                    System.out.println("Programa Encerrado");
                    menu=false;
                    break;


            }


        }

    }
}
