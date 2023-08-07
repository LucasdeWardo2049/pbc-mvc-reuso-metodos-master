package view;

import model.Cliente;
import model.Dependente;
import model.RelacaoEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteUI {

    public Cliente lerDados() {
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

        Cliente cliente = new Cliente(nome, endereco, telefone, email, cpf);

        System.out.print("Deseja adicionar dependentes? (S/N): ");
        String opcao = entrada.nextLine();
        if (opcao.equalsIgnoreCase("S")) {
            List<Dependente> dependentes = lerDependentes();
            cliente.getDependentes().addAll(dependentes);
        }

        return cliente;
    }

    private List<Dependente> lerDependentes() {
        Scanner entrada = new Scanner(System.in);

        List<Dependente> dependentes = new ArrayList<>();

        System.out.print("Quantidade de dependentes: ");
        int quantidade = entrada.nextInt();
        entrada.nextLine(); // Limpar o buffer

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Dependente #" + (i + 1));
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
            System.out.print("Relação: ");
            String relacaoStr = entrada.nextLine();
            RelacaoEnum relacao = RelacaoEnum.valueOf(relacaoStr);

            Dependente dependente = new Dependente(nome, endereco, telefone, email, cpf, relacao);
            dependentes.add(dependente);
        }

        return dependentes;
    }

    public void listar(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Endereço: " + cliente.getEndereco());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("E-mail: " + cliente.getEmail());
            System.out.println("CPF: " + cliente.getCpf());

            List<Dependente> dependentes = cliente.getDependentes();
            if (!dependentes.isEmpty()) {
                System.out.println("Dependentes:");
                for (Dependente dependente : dependentes) {
                    System.out.println("Nome: " + dependente.getNome());
                    System.out.println("Endereço: " + dependente.getEndereco());
                    System.out.println("Telefone: " + dependente.getTelefone());
                    System.out.println("E-mail: " + dependente.getEmail());
                    System.out.println("CPF: " + dependente.getCpf());
                    System.out.println("Relação: " + dependente.getRelacao());
                }
            }
            System.out.println();
        }
    }
}
// Nesta atualização, adicionei a funcionalidade para exibir os dependentes de cada cliente, caso existam. Agora, a classe ClienteUI exibe as informações dos dependentes, incluindo o campo "Relação" da classe Dependente.