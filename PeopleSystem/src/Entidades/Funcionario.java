package Entidades;

import Composicao.Cargo;
import Composicao.Endereco;
import Composicao.Telefone;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa{

    private String matricula;
    private double salario;
    private LocalDate dataAdmissao;

    private Cargo cargo;
    Scanner input = new Scanner(System.in);
    public Funcionario(String nome, LocalDate dataNascimento, List<Telefone> telefones, Endereco endereco, Cargo cargo, String matricula, double salario, LocalDate dataAdmissao) {
        super(nome, dataNascimento, telefones, endereco, cargo);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }


    public Funcionario(String matricula, double salario, LocalDate dataAdmissao) {
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
    public Funcionario(){}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario" + "\n" + super.toString()
                +"\nMatricula: " + matricula +
                "\nSalario: R$" + salario +
                "\nData de Admissão: " + dataAdmissao +
                "\nCargo: " + cargo;
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe a matricula: ");
        this.matricula = input.nextLine();
        System.out.println("Informe o salário: R$");
        this.salario = input.nextDouble();
        input.nextLine();
        System.out.println("Cadastrando cargo");
        cadastrarCargo();
        System.out.println("Informe a data de admissão ");
        System.out.println("Informe o dia: ");
        int dia = input.nextInt();
        System.out.println("Informe o mês: ");
        int mes = input.nextInt();
        System.out.println("Informe o ano: ");
        int ano = input.nextInt();
        input.nextLine();
        this.dataAdmissao = LocalDate.of(ano, mes, dia);


    }

    public void reajustarSalario(double percentual) {
        if (percentual > 0) {
            double aumento = salario * (percentual / 100);
            salario += aumento;
            System.out.println("Salário reajustado com sucesso! Novo salário: R$" + salario);
        } else {
            System.out.println("O percentual de reajuste deve ser positivo.");
        }
    }

    public void cadastrarCargo() {
        System.out.println("Informe o nome do cargo: ");
        String titulo = input.nextLine();
        System.out.println("Informe a descrição do cargo: ");
        String descricao = input.nextLine();
        this.cargo = new Cargo(titulo, descricao);     }
}
