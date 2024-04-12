package infra;

import db.DB;
import db.factory.DBFactory;
import entidade.Aluguel;
import exceptions.AluguelException;
import infra.interfaces.GerenciaAluguelECompraInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlugueisDoSistema implements GerenciaAluguelECompraInterface<Aluguel> {
    private final List<Aluguel> alugueis = new ArrayList<>();
    private final DB<Aluguel> dataBase = DBFactory.createAluguelDB();

    @Override
    public void cadastrar(Aluguel aluguel) {
        alugueis.add(aluguel);
        dataBase.salvarDados(alugueis);
    }

    @Override
    public void remover(String email, String chassi) {
        for (Aluguel aluguel : this.alugueis) {
            if (aluguel.emailEChassiEhValido(email, chassi)) {
                alugueis.remove(aluguel);
                dataBase.salvarDados(alugueis);
                return;
            }
        }
        throw new AluguelException("Email ou número do Chassi inválidos.");
    }

    @Override
    public List<Aluguel> buscar(String numeracaoDocumento) {
        List<Aluguel> listaAlugueis = new ArrayList<>();

        for (Aluguel aluguel : this.alugueis) {
            if (aluguel.documentoEhValido(numeracaoDocumento))
                listaAlugueis.add(aluguel);
        }
        if (listaAlugueis.isEmpty())
            throw new AluguelException();

        return listaAlugueis;
    }

    @Override
    public List<Aluguel> listarTodos() {
        return alugueis;
    }
}