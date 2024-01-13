package infra;

import entidade.Carro;
import infra.interfaces.CrudInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class CarrosDoSistema implements CrudInterface {

    private final Map<String, Carro> carros = new HashMap<>();

    @Override
    public void cadastrar(Object type) {
        carros.put((String) type, (Carro) type);
    }

    @Override
    public void remover(String id) {
        carros.remove(id);
    }

    @Override
    public Object buscar(String id) {
        return carros.get(id);
    }

    @Override
    public Object atualizar(String id, Object type) {
        return carros.put(id, (Carro) type);
    }

    @Override
    public Boolean existeNoSistema(String id) {
        return carros.containsKey(id);
    }

    @Override
    public List retornarTodos() {
        return Arrays.asList(carros.values().toArray());
    }
}
