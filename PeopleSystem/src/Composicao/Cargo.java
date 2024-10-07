package Composicao;

public class Cargo {

    private String titulo;
    private String descricao;

    public Cargo(String titulo, String descricao) {
        this.titulo = titulo;

        this.descricao = descricao;
    }

    public Cargo(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return titulo + " - " + descricao;
    }
}
