package Composicao;

public class Profissao {

    private String nomeProfissao;

    public Profissao(){}

    public Profissao(String nome) {
        this.nomeProfissao = nome;
    }

    public String getNomeProfissao() {
        return nomeProfissao;
    }

    public void setNomeProfissao(String nomeProfissao) {
        this.nomeProfissao = nomeProfissao;
    }

    @Override
    public String toString() {
        return nomeProfissao;
    }
}
