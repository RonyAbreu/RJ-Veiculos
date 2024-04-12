package entidade;

import java.io.Serializable;
import java.util.Objects;

public class Endereco implements Serializable {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private Integer numeroDaCasa;

    public Endereco(){
    }

    public Endereco(String rua, String bairro, String cidade, String estado, Integer numeroDaCasa) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numeroDaCasa = numeroDaCasa;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", numeroDaCasa=" + numeroDaCasa +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Endereco endereco = (Endereco) object;
        return Objects.equals(rua, endereco.rua) && Objects.equals(bairro, endereco.bairro) && Objects.equals(cidade, endereco.cidade) && Objects.equals(estado, endereco.estado) && Objects.equals(numeroDaCasa, endereco.numeroDaCasa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, bairro, cidade, estado, numeroDaCasa);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(Integer numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }
}
