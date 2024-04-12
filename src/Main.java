import db.DB;
import db.factory.DBFactory;
import entidade.Carro;
import entidade.Pessoa;
import infra.ComprasDoSistema;
import infra.PessoasDoSistema;
import mock.Mock;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static final PessoasDoSistema pessoasDoSistema = new PessoasDoSistema();
    private static final ComprasDoSistema comprasDoSistema = new ComprasDoSistema();
    public static void main(String[] args) {
        System.out.println("Ok...");
    }
}