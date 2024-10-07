package Entidades;

import Composicao.Cargo;
import Composicao.Endereco;
import Composicao.Telefone;
import java.time.Period;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private List<Telefone> telefones = new ArrayList<>();
    private Endereco endereco;
    private Cargo cargo;

    private static Scanner input = new Scanner(System.in);
    public Pessoa(String nome, LocalDate dataNascimento, List<Telefone> telefones, Endereco endereco, Cargo cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefones = telefones;
        this.endereco = endereco;
        this.cargo = cargo;
    }

    public Pessoa(){}

    @Override
    public String toString() {
        return "Nome: '" + nome + '\n' +
                "Data de Nascimento: " + dataNascimento +
                "\nTelefones: " + telefones +
                "\nEndereço: " + endereco;

    }

    public void cadastrar() {
        System.out.println("Informe o nome: ");
        this.nome = input.nextLine();
        System.out.println("Informe a data de nascimento! ");
        System.out.println("Informe o dia: ");
        int dia = input.nextInt();
        System.out.println("Informe o mês: ");
        int mes = input.nextInt();
        System.out.println("Informe o ano: ");
        int ano = input.nextInt();
        input.nextLine();
        this.dataNascimento = LocalDate.of(ano, mes, dia);
        cadastrarEndereco();
        cadastrarTelefones();

    }
    public void cadastrarEndereco() {
        System.out.println("Cadastrando o endereço");
        System.out.println("Digite a rua:");
        String rua = input.nextLine();
        System.out.println("Digite o número:");
        String numero = input.nextLine();
        System.out.println("Digite a cidade:");
        String cidade = input.nextLine();
        System.out.println("Digite o estado:");
        String estado = input.nextLine();
        System.out.println("Digite o CEP:");
        String cep = input.nextLine();

        this.endereco = new Endereco(rua, numero, cidade, estado, cep);
    }


    public void cadastrarTelefones() {
        System.out.println("Cadastrando telefones");
        while (true) {
            System.out.println("Digite o DDD:");
            String ddd = input.nextLine();
            System.out.println("Digite o número do telefone:");
            String numero = input.nextLine();
            Telefone telefone = new Telefone(ddd, numero);
            telefones.add(telefone);

            System.out.println("Deseja cadastrar outro telefone? (S/N)");
            String resposta = input.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
    }


    public int obterIdade(){
        LocalDate dataNascimento = this.dataNascimento;
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);

        return periodo.getYears();
    }

}