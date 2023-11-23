package composicao;

public enum Cargo {
    CHEFE("Chefe"),
    VENDEDOR("Vendedor"),
    RECEPCIONISTA("Recepcionista");

    private final String nome;

    Cargo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
