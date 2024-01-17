package exceptions;

public class CarroNaoExisteException extends RuntimeException {

    public CarroNaoExisteException(String msg) {
        super(msg);
    }

    public CarroNaoExisteException(){
        super("Carro não existe no sistema!");
    }

}
