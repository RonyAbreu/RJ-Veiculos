package entidade.subentidade;

import entidade.Endereco;
import entidade.Pessoa;

import java.time.LocalDate;
import java.util.Objects;

public class PessoaPJ extends Pessoa {
    private String cnpj;

    public PessoaPJ(){
    }

    public PessoaPJ(String nome, String telefone, String email, LocalDate dataNascimento, Endereco endereco, String cnpj) {
        super(nome, telefone, email, dataNascimento, endereco);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() +
                "cnpj='" + cnpj + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        PessoaPJ pessoaPJ = (PessoaPJ) object;
        return Objects.equals(cnpj, pessoaPJ.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
