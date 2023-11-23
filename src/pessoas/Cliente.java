package pessoas;

import composicao.Endereco;
import composicao.Profissao;

public class Cliente extends Pessoa {
    private String codigo;
    private Profissao profissao;

    public void cadastrar(String codigo, Profissao profissao,
                          String nome, String dataNascimento,
                          Endereco endereco, String telsContato) {
        this.codigo = codigo;
        this.profissao = profissao;
        cadastrar(nome, dataNascimento, endereco, telsContato);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
