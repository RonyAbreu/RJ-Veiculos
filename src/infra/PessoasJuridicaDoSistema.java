package infra;

import entidade.subentidade.PessoaPJ;
import exceptions.PessoaJaExisteException;
import exceptions.PessoaNaoExisteException;
import infra.impl.CrudInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PessoasJuridicaDoSistema implements CrudInterface<PessoaPJ> {
    private final Map<String,PessoaPJ> mapaDePessoas = new HashMap<>();
    @Override
    public void cadastrar(PessoaPJ pessoaPJ) {
        if (existeNoSistema(pessoaPJ.getCnpj())){
            throw new PessoaJaExisteException();
        }
        mapaDePessoas.put(pessoaPJ.getCnpj(), pessoaPJ);
    }

    @Override
    public void remover(String cnpj) {
        if (!existeNoSistema(cnpj)){
            throw new PessoaNaoExisteException();
        }
        mapaDePessoas.remove(cnpj);
    }

    @Override
    public PessoaPJ buscar(String cnpj) {
        if (!existeNoSistema(cnpj)){
            throw new PessoaNaoExisteException();
        }
        return mapaDePessoas.get(cnpj);
    }

    @Override
    public PessoaPJ atualizar(String cnpj, PessoaPJ pessoaNova) {
        if (!existeNoSistema(cnpj)){
            throw new PessoaNaoExisteException();
        }

        PessoaPJ pessoaRetornada = mapaDePessoas.get(cnpj);
        atualizarDados(pessoaRetornada, pessoaNova);
        return pessoaRetornada;
    }

    private void atualizarDados(PessoaPJ pessoaRetornada, PessoaPJ pessoaNova) {
        pessoaRetornada.setNome(pessoaNova.getNome());
        pessoaRetornada.setEmail(pessoaNova.getEmail());
        pessoaRetornada.setTelefone(pessoaNova.getTelefone());
        pessoaRetornada.setDataNascimento(pessoaNova.getDataNascimento());
    }

    @Override
    public Boolean existeNoSistema(String cnpj) {
        return mapaDePessoas.containsKey(cnpj);
    }

    @Override
    public List<PessoaPJ> retornarTodos() {
        return new ArrayList<>(mapaDePessoas.values());
    }
}
