package repositorio;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio {

    private static List<Cliente> clientes = new ArrayList<>() ;

    public  static void salvar(Cliente cliente){
        clientes.add(cliente);
    }

    public static List<Cliente> listar(){
        return clientes;
    }

}
