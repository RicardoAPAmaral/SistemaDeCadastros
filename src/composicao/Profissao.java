package composicao;

public enum Profissao {
    MEDICO("Médico"),
    ENGENHEIRO("Engenheiro"),
    PROFESSOR("Professor"),
    OUTRA("Outra");

    private final String descricao;

    Profissao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
