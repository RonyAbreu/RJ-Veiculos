package entidade;

import enums.TipoDocumento;

import java.io.Serializable;
import java.util.Objects;

public class Documento implements Serializable {
    private TipoDocumento tipoDocumento;
    private String numeracao;

    public Documento(){
    }

    public Documento(TipoDocumento tipoDocumento, String numeracao) {
        this.tipoDocumento = tipoDocumento;
        this.numeracao = numeracao;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipoDocumento=" + tipoDocumento +
                ", numeracao='" + numeracao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Documento documento = (Documento) object;
        return Objects.equals(numeracao, documento.numeracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeracao);
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }
}
