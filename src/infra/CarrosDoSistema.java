package infra;

import entidade.Carro;
import infra.impl.CrudInterface;

import java.util.HashMap;
import java.util.Map;

public class CarrosDoSistema implements CrudInterface {

    private final Map<String, Carro> carros = new HashMap<>();

    @Override
    public void cadastrar(Object type) {

    }

    @Override
    public void remover(String id) {

    }

    @Override
    public Object buscar(String id) {
        return null;
    }

    @Override
    public Object atualizar(String id, Object type) {
        return null;
    }
}
