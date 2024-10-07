import Entidades.Cliente;
import Entidades.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("=-= Cadastro =-=");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:

                    Cliente cliente = new Cliente();
                    cliente.cadastrar();
                    System.out.println("Cliente cadastrado com sucesso!");
                    System.out.println(cliente);
                    break;

                case 2:
                    Funcionario funcionario = new Funcionario();
                    funcionario.cadastrar();
                    System.out.println("Funcionário cadastrado com sucesso!");
                    System.out.println(funcionario);
                    break;


                case 0:
                    System.out.println("Fechando...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        input.close();
    }
 }

