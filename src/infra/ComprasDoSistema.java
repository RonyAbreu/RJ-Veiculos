package infra;

import entidade.Compra;
import exceptions.CompraException;
import infra.interfaces.GerenciaAluguelECompraInterface;

import java.util.ArrayList;
import java.util.List;

public class ComprasDoSistema implements GerenciaAluguelECompraInterface<Compra> {
    private final List<Compra> listaDeCompras = new ArrayList<>();

    @Override
    public void cadastrar(Compra compra) {
        listaDeCompras.add(compra);
    }

    @Override
    public void remover(String email, String chassi) {
        //TODO
    }

    @Override
    public List<Compra> buscar(String numeracaoDocumento) {
        List<Compra> comprasRetornadas = new ArrayList<>();

        for (Compra c : listaDeCompras){
            if (c.getPessoa().getNumeracaoDocumento().equals(numeracaoDocumento)){
                comprasRetornadas.add(c);
            }
        }

        if (comprasRetornadas.isEmpty()){
            throw new CompraException();
        }

        return comprasRetornadas;
    }

    @Override
    public List<Compra> listarTodos() {
        return listaDeCompras;
    }
}
