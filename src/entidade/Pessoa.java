package entidade;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Pessoa implements Serializable {
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Documento documento;

    public Pessoa(){
    }

    public Pessoa(String nome, String telefone, String email, LocalDate dataNascimento, Endereco endereco, Documento documento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                ", documento=" + documento +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pessoa pessoa = (Pessoa) object;
        return Objects.equals(documento, pessoa.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }

    public String getNumeracaoDocumento(){
        return documento.getNumeracao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
