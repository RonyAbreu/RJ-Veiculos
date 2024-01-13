package infra;

import entidade.Pessoa;
import exceptions.PessoaJaExisteException;
import exceptions.PessoaNaoExisteException;
import infra.interfaces.CrudInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PessoasDoSistema implements CrudInterface<Pessoa> {
    private final Map<String, Pessoa> mapaDePessoas = new HashMap<>();

    @Override
    public void cadastrar(Pessoa pessoa) {
        if (existeNoSistema(pessoa.getDocumento().getNumeracao())){
            throw new PessoaJaExisteException();
        }
        mapaDePessoas.put(pessoa.getDocumento().getNumeracao(), pessoa);
    }

    @Override
    public void remover(String cpf) {
        if (!existeNoSistema(cpf)){
            throw new PessoaNaoExisteException();
        }
        mapaDePessoas.remove(cpf);
    }

    @Override
    public Pessoa buscar(String cpf) {
        if (!existeNoSistema(cpf)){
            throw new PessoaNaoExisteException();
        }
        return mapaDePessoas.get(cpf);
    }

    @Override
    public Pessoa atualizar(String cpf, Pessoa pessoaNova) {
        if (!existeNoSistema(cpf)){
            throw new PessoaNaoExisteException();
        }
        Pessoa pessoaRetornada = mapaDePessoas.get(cpf);
        atualizarDados(pessoaRetornada, pessoaNova);
        return pessoaRetornada;
    }

    private void atualizarDados(Pessoa pessoaRetornada, Pessoa pessoaNova) {
        pessoaRetornada.setNome(pessoaNova.getNome());
        pessoaRetornada.setEmail(pessoaNova.getEmail());
        pessoaRetornada.setTelefone(pessoaNova.getTelefone());
        pessoaRetornada.setDataNascimento(pessoaNova.getDataNascimento());
    }

    @Override
    public Boolean existeNoSistema(String cpf) {
        return mapaDePessoas.containsKey(cpf);
    }

    @Override
    public List<Pessoa> retornarTodos() {
        return new ArrayList<>(mapaDePessoas.values());
    }
}
