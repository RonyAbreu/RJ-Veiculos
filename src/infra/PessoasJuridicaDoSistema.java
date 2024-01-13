package infra;

import entidade.subentidade.PessoaPJ;
import infra.impl.CrudInterface;

import java.util.HashMap;
import java.util.Map;

public class PessoasJuridicaDoSistema implements CrudInterface<PessoaPJ> {
    private final Map<String,PessoaPJ> pessoasPJ = new HashMap<>();
    @Override
    public void cadastrar(PessoaPJ type) {

    }

    @Override
    public void remover(String id) {

    }

    @Override
    public PessoaPJ buscar(String id) {
        return null;
    }

    @Override
    public PessoaPJ atualizar(String id, PessoaPJ type) {
        return null;
    }
}
