package br.com;

import br.com.dao.ClienteMapDAO;
import br.com.dao.IClienteDAO;
import br.com.lucas.Cliente;

import javax.swing.*;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String args[]) {
        iClienteDAO = new ClienteMapDAO();



        while (true) {
            String opcao = JOptionPane.showInputDialog(null,"Digite 1 para cadastro, 2 para consultar, 3 para exclusao, 4 para alteracao ou 5 para sair",
                    "Cadastro",JOptionPane.INFORMATION_MESSAGE);
            switch (opcao) {
                case "1":
                    String dados = JOptionPane.showInputDialog(null,"Digite os dados do cliente separados por virgula, conforme exemplo: Nome, CPF, Telefone, Endereco, Numero e Estado",
                            "Cadastro",JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dados);
                    break;
                case "2":
                    String cpf = JOptionPane.showInputDialog(null,"Digite o CPF:",
                            "Consulta",JOptionPane.INFORMATION_MESSAGE);
                    consultar(cpf);
                    break;
                case "3":
                    opcao = JOptionPane.showInputDialog(null,"op 3",
                            "Cadastro",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "4":
                    opcao = JOptionPane.showInputDialog(null,"op 4",
                            "Cadastro",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Até logo", "Sair", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
            }
        }
    }



    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");

        String nome = valido(dadosSeparados, 0);
        String cpf = valido(dadosSeparados, 1);
        String tel = valido(dadosSeparados, 2);
        String end = valido(dadosSeparados, 3);
        String numero = valido(dadosSeparados, 4);
        String cidade = valido(dadosSeparados, 5);
        String estado = valido(dadosSeparados, 6);
        Cliente cliente = new Cliente(nome, cpf, tel, end, numero, cidade, estado);
        Boolean cadastrado = iClienteDAO.cadastrar(cliente);

        if(cadastrado) {
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Cliente ja cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);

        }
    }


    private static String valido(String[] arr, int index) {
        return (index < arr.length ? arr[index] : null);
    }

    private static void consultar(String cpf) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(cpf));

        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
