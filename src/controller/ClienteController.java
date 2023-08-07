package controller;

import model.Cliente;
import repositorio.ClienteRepositorio;
import view.ClienteUI;

import java.util.List;

public class ClienteController {

    private ClienteUI clienteUI = new ClienteUI();

    public void cadastrar(){

        Cliente cliente = clienteUI.lerDados();

        if(cliente != null) {
            ClienteRepositorio.salvar(cliente);
        }

    }

    public void listar(){

        clienteUI.listar(ClienteRepositorio.listar());

    }

}
