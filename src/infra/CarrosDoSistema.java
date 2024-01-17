package infra;

import entidade.Carro;
import exceptions.CarroJaExisteException;
import exceptions.CarroNaoExisteException;
import infra.interfaces.CrudInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarrosDoSistema implements CrudInterface<Carro> {

    private final Map<String, Carro> carros = new HashMap<>();

    @Override
    public void cadastrar(Carro carro) {
        if (existeNoSistema(carro.getNumeroChassi()))
            throw new CarroJaExisteException();
        carros.put(carro.getNumeroChassi(), carro);
    }

    @Override
    public void remover(String id) {
        if (!existeNoSistema(id))
            throw new CarroNaoExisteException();
        carros.remove(id);
    }

    @Override
    public Carro buscar(String id) {
        if (!existeNoSistema(id))
            throw new CarroNaoExisteException();
        return carros.get(id);
    }

    @Override
    public Carro atualizar(String id, Carro carroNovo) {
        if (!existeNoSistema(id))
            throw new CarroNaoExisteException();
        Carro carroVelho = carros.get(id);
        atualizarCarro(carroVelho, carroNovo);
        return carroVelho;
    }

    private void atualizarCarro(Carro carroVelho , Carro carroNovo){
        carroVelho.setMarca(carroNovo.getMarca());
        carroVelho.setModelo(carroNovo.getModelo());
        carroVelho.setCor(carroNovo.getCor());
        carroVelho.setCombustivel(carroNovo.getCombustivel());
        carroVelho.setQuantPortas(carroNovo.getQuantPortas());
    }

    @Override
    public Boolean existeNoSistema(String id) {
        return carros.containsKey(id);
    }

    @Override
    public List<Carro> retornarTodos() {
        return new ArrayList<>(carros.values());
    }
}
