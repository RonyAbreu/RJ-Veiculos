package entidade.subentidade;

import entidade.Endereco;
import entidade.Pessoa;

import java.time.LocalDate;
import java.util.Objects;

public class PessoaPF extends Pessoa {
    private String cpf;
    
    public PessoaPF(){
    }

    public PessoaPF(String nome, String telefone, String email, LocalDate dataNascimento, Endereco endereco, String cpf) {
        super(nome, telefone, email, dataNascimento, endereco);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PessoaPF pessoaPF = (PessoaPF) object;
        return Objects.equals(cpf, pessoaPF.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
}
