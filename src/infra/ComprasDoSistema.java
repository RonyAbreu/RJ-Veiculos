package infra;

import entidade.Compra;
import infra.impl.CrudInterface;

import java.util.ArrayList;
import java.util.List;

public class ComprasDoSistema implements CrudInterface<Compra> {
    private final List<Compra> compras = new ArrayList<>();
    @Override
    public void cadastrar(Compra type) {

    }

    @Override
    public void remover(String id) {

    }

    @Override
    public Compra buscar(String id) {
        return null;
    }

    @Override
    public Compra atualizar(String id, Compra type) {
        return null;
    }

    @Override
    public Boolean existeNoSistema(String id) {
        return null;
    }

    @Override
    public List<Compra> retornarTodos() {
        return null;
    }
}
