package infra.impl;

import java.util.List;

public interface CrudInterface<T> {
    void cadastrar(T type);
    void remover(String id);
    T buscar(String id);
    T atualizar(String id, T type);
    Boolean existeNoSistema(String id);
    List<T> retornarTodos();
}
