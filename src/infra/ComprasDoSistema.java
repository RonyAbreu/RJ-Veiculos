package infra;

import db.DB;
import db.factory.DBFactory;
import entidade.Compra;
import exceptions.CompraException;
import infra.interfaces.GerenciaAluguelECompraInterface;

import java.util.ArrayList;
import java.util.List;

public class ComprasDoSistema implements GerenciaAluguelECompraInterface<Compra> {
    private final List<Compra> listaDeCompras = new ArrayList<>();
    private final DB<Compra> dataBase = DBFactory.createCompraDB();

    @Override
    public void cadastrar(Compra compra) {
        listaDeCompras.add(compra);
        dataBase.salvarDados(listaDeCompras);
    }

    @Override
    public void remover(String email, String chassi) {
        for (Compra c : listaDeCompras){
            if (c.emailEhValido(email) && c.chassiEhValido(chassi)){
                listaDeCompras.remove(c);
                dataBase.salvarDados(listaDeCompras);
                return;
            }
        }

        throw new CompraException("Nenhuma compra foi encontrada!");
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
