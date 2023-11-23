package pessoas;

import composicao.Endereco;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private String telsContato;

    public void cadastrar(String nome,
                          String dataNascimento,
                          Endereco endereco,
                          String telsContato){
        this.nome=nome;
        this.dataNascimento = dataNascimento;
        this.endereco=endereco;
        this.telsContato=telsContato;

    }
    public int obterIdade(){
        int idade=0;
        //calculo de idade: ano atual-data
        return idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telsContato) {
        this.telsContato = telsContato;
    }
}
