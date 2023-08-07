package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    private List<Dependente> dependentes = new ArrayList<>();

    public Cliente() {
        super();
    }
    public Cliente(String nome, String endereco, String telefone, String email, String cpf) {
        super(nome, endereco, telefone, email, cpf);
    }

    public void addDependente(Dependente dependente){
        dependentes.add(dependente);
    }

    public List<Dependente> getDependentes(){
        return dependentes;
    }
}
