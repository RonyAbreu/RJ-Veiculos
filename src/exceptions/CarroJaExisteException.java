package exceptions;

public class CarroJaExisteException extends RuntimeException{

    public CarroJaExisteException(String msg){
        super(msg);
    }

    public CarroJaExisteException(){
        super("Carro já existe no sistema!");
    }

}
