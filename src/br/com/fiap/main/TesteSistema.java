package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema {

    // String
    static String texto(String j) {
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String  j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        Cliente objCliente = new Cliente(
      //  String rg, String nome, int idade, String cpf, double renda
        texto("RG: "),
        texto("Nome cliente: "),
        inteiro("Idade"),
        texto("CPF: "),
        real("Renda: ")

        );
        Endereco objEndCliente = new Endereco(
        // String logradouro, int numero, String cep, String bairro, String cidade
        texto("Logradouro: "),
        inteiro("Número: "),
        texto("CEP: "),
        texto("Bairro: "),
        texto("Cidade")
        );

        objCliente.setEndereco(objEndCliente);

        Empresa objEmpresa = new Empresa(
        // String cnpj, String razaoSocial
        texto("CNPJ: "),
        texto("Razão Social: ")
        );

        Endereco objEndEmpresa = new Endereco(
        // String logradouro, int numero, String cep, String bairro, String cidade
        texto("Logradouro: "),
        inteiro("Número: "),
        texto("CEP: "),
        texto("Bairro: "),
        texto("Cidade")
        );

        objEmpresa.setEndereco(objEndEmpresa);

        System.out.println(objCliente);
        System.out.println(objEmpresa);
    }
}
