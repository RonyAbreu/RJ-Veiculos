package infra.interfaces;

import java.util.List;

public interface GerenciaAluguelECompraInterface<T> {
    void cadastrar(T t);
    void remover (String email, String chassi);
    List<T> buscar(String numeracaoDocumento);
    List<T> listarTodos();
}
