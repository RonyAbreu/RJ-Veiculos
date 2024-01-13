package exceptions;

public class PessoaJaExisteException extends RuntimeException{

    public PessoaJaExisteException(String msg){
        super(msg);
    }

    public PessoaJaExisteException(){
        super("Pessoa já existe no sistema!");
    }
}
