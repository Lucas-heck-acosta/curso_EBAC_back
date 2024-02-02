/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudswing;

/**
 *
 * @author lucas
 */


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO{

    private Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }
    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente encontrado = null;
        for (Cliente cliente : this.set)
        {
            if (cliente.getCpf().equals(cpf)) {
                encontrado = cliente;
                break;
            }
        }
        if (encontrado != null) {
            this.set.remove(encontrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteCadastrado : this.set) {
                if(clienteCadastrado.equals(cliente)) {
                    clienteCadastrado.setNome(cliente.getNome());
                    clienteCadastrado.setTel(cliente.getTel());
                    clienteCadastrado.setNumero(cliente.getNumero());
                    clienteCadastrado.setEnd(cliente.getEnd());
                    clienteCadastrado.setCidade(cliente.getCidade());
                    clienteCadastrado.setEstado(cliente.getEstado());
                }
            }
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente clienteCadastrado : this.set) {
            if (clienteCadastrado.getCpf().equals(cpf)) {
                return  clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> bucarTodos() {
        return this.set;
    }
}
