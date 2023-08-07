package view;

import model.Cliente;

import java.util.List;
import java.util.Scanner;

public class ClienteUI {


    public Cliente lerDados(){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Endereço: ");
        String endereco = entrada.nextLine();
        System.out.print("Telefone: ");
        String telefone = entrada.nextLine();
        System.out.print("E-mail: ");
        String email = entrada.nextLine();
        System.out.print("CPF: ");
        String cpf = entrada.nextLine();

        try {
            Cliente cliente = new Cliente(nome, endereco, telefone, email, cpf);
            return cliente;
        }catch(RuntimeException e){
            System.out.println("Não foi possível inserir pessoa: "+e.getMessage());
        }

        return null;
    }

    public void listar(List<Cliente> clientes){

        for(Cliente cliente:clientes){
            System.out.println("Nome:"+cliente.getNome());
            System.out.println("Endereço:"+cliente.getEndereco());
            System.out.println("Telefone:"+cliente.getTelefone());
            System.out.println("E-mail:"+cliente.getEmail());
            System.out.println("CPF:"+cliente.getCpf());
        }

    }


}
