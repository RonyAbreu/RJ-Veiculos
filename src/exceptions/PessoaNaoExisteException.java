package exceptions;

public class PessoaNaoExisteException extends RuntimeException{

    public PessoaNaoExisteException(String msg){
        super(msg);
    }

    public PessoaNaoExisteException(){
        super("Pessoa não existe no sistema!");
    }
}
