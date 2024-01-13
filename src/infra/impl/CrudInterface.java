package infra.impl;

public interface CrudInterface<T> {
    void cadastrar(T type);
    void remover(String id);
    T buscar(String id);
    T atualizar(String id, T type);
}
