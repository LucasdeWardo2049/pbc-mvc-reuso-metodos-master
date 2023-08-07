package controller;

import java.util.Scanner;

public class HomeController {

    public void executar() {

        ClienteController clienteController = new ClienteController();

        Scanner entrada = new Scanner(System.in);

        while (true) {

            System.out.println("***Menu Principal***");

            System.out.println("1:Cadastrar Cliente");
            System.out.println("2:Listar Clientes");
            System.out.println("3:Sair");
            System.out.print("Selecione opção:");
            int opcao = entrada.nextInt();

            if (opcao == 1) {
                clienteController.cadastrar();
            } else if (opcao == 2) {
                clienteController.listar();
            } else if (opcao == 3) {
                break;
            }
        }
    }

}
