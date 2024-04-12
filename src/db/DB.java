package db;

import java.util.List;

public interface DB<T> {
    void salvarDados(List<T> t);
    List<T> listarDados();
}
