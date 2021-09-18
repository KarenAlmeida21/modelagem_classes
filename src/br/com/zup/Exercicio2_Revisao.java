package br.com.zup;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2_Revisao {
    public static void main(String[] args) {
        //Crie um programa para gerenciar uma lista de candidatos de um vestibular,
        // cada candidato tem número de matrícula e uma nota. No final do programa,
        // o usuário deve decidir se irá adicionar mais de um candidato,
        // exibir todos os candidatos cadastrados ou excluir um candidato pelo número de matrícula

        Scanner leitor = new Scanner(System.in);
        Map<String, String> lista_vestibulandos = new HashMap<String, String>();


        boolean menu = true;


        while (menu == true) {
            System.out.println("Faculdade Blá Blá Blá");
            System.out.println("1- Ver lista de vestibulando e suas informações");
            System.out.println("2- Adicionar vestibulando");
            System.out.println("3- Excluir vestibulando");
            System.out.println("4- Fechar programa");
            int opcao_menu = leitor.nextInt();
            leitor.nextLine();
            switch (opcao_menu) {
                case 1:
                 //   System.out.println(lista_vestibulandos);
                    for (String chave_ra:lista_vestibulandos.keySet()) {
                        System.out.println(lista_vestibulandos.get(chave_ra));


                    }

                    break;
                case 2:
                    System.out.println("Digite o R.A do novo vestibulando:");
                    String ra_vestibulando= leitor.nextLine();
                    System.out.println("Digite o nome do novo vestibulando:");
                    String nome_vestibulando= leitor.nextLine();
                    System.out.println("Digite  a nota do novo vestibulando:");
                    String nota_vestibulando= leitor.nextLine();

                    lista_vestibulandos.put(ra_vestibulando, "R.A: " + ra_vestibulando +  " Nome: " + nome_vestibulando + " Nota: " + nota_vestibulando);
                    System.out.println("Vestibulando Cadastrado Com Sucesso");
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Digite o R.A que você deseja excluir:");
                    String exclusao=leitor.nextLine();

                    for (String chave_ra:lista_vestibulandos.keySet()) {
                        if(chave_ra.equals(exclusao)){
                            System.out.println("R.A Removido Com Sucesso");
                            System.out.println("\n");
                        }

                    }
                    lista_vestibulandos.remove(exclusao);
                    break;

            }

        }


    }
}


