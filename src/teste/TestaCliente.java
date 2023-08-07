package teste;

import model.Cliente;
import model.Dependente;
import model.RelacaoEnum;

public class TestaCliente {


    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Rogerio","Rua A","92912345678",
                "rogerio@email.com","12345678901");
        cliente1.addDependente(new Dependente("Filho Um","Rua D","92121111111",
                "filho01@email.com","33333333333", RelacaoEnum.Filho));
        cliente1.addDependente(new Dependente("Filho Dois","Rua E","92121222222",
                "filho02@email.com","44444444444", RelacaoEnum.Filho));


        for(Dependente dependente:cliente1.getDependentes()){
            System.out.println("nome:"+dependente.getNome());
            System.out.println("endereco:"+dependente.getEndereco());
            System.out.println("telefone:"+dependente.getTelefone());
            System.out.println("email:"+dependente.getEmail());
            System.out.println("cpf:"+dependente.getCpf());
            System.out.println("Relação:"+dependente.getRelacao());
        };


        Cliente cliente2 = new Cliente("Maria","Rua B","929123111111","maria@email.com","222222222222");

//        ClienteRepositorio.salvar(cliente1);
//        ClienteRepositorio.salvar(cliente2);


    }


}
