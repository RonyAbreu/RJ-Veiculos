package exceptions;

public class CompraException extends RuntimeException{
    public CompraException(){
        super("Nenhuma compra cadastrada, ou conta inexistente! ");
    }
}
