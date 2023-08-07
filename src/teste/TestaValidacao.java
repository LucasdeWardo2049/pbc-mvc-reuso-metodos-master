package teste;

import model.Cliente;

public class TestaValidacao {

    public static void main(String[] args) {

//        Validacao.validarSomenteLetrasEEspaco("Rogerio1");

        Cliente cliente = new Cliente();

        cliente.setNome("Rogerio1");

        System.out.println(cliente.getNome());



    }

}
