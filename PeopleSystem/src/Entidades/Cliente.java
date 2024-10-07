package Entidades;

import Composicao.Cargo;
import Composicao.Endereco;
import Composicao.Profissao;
import Composicao.Telefone;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Pessoa{

    private String codigo;
    private Profissao profissao;

    Scanner input = new Scanner(System.in);
    public Cliente(String nome, LocalDate dataNascimento, List<Telefone> telefones, Endereco endereco, Cargo cargo, String codigo, Profissao profissao) {
        super(nome, dataNascimento, telefones, endereco, cargo);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    public Cliente(){}

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

    public Cliente(String codigo, Profissao profissao) {
        this.codigo = codigo;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente" +
                "\n" + super.toString() +
                "\nCódigo: " + codigo +
                "\nProfissão: " + profissao;
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe o código do cliente: ");
        this.codigo = input.nextLine();
        System.out.println("Informe a profissão: ");
        String nomeProfissao = input.nextLine();
        this.profissao = new Profissao(nomeProfissao);
        System.out.println();
    }
}
