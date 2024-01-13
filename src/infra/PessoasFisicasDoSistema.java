package infra;

import entidade.subentidade.PessoaPF;
import infra.impl.CrudInterface;

import java.util.HashMap;
import java.util.Map;

public class PessoasFisicasDoSistema implements CrudInterface<PessoaPF> {
    private final Map<String, PessoaPF> pessoasPF = new HashMap<>();

    @Override
    public void cadastrar(PessoaPF type) {

    }

    @Override
    public void remover(String id) {

    }

    @Override
    public PessoaPF buscar(String id) {
        return null;
    }

    @Override
    public PessoaPF atualizar(String id, PessoaPF type) {
        return null;
    }
}
