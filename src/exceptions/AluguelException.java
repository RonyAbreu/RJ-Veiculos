package exceptions;

public class AluguelException extends RuntimeException {

    public AluguelException(String msg) {
        super(msg);
    }

    public AluguelException() {
        super("Nenhum aluguel cadastrado ou conta inexistente.");
    }
}

