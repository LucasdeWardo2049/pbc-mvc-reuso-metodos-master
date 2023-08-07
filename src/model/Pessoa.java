package model;

import util.Validacao;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, String email, String cpf) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Validacao.validarSomenteLetrasEEspaco(nome);
        Validacao.validarTamanhoMinimo(nome, 1);
        Validacao.validarTamanhoMaximo(nome, 100);
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Validacao.validarEmail(email);
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}