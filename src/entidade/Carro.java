package entidade;

import enums.TipoCombustivel;

import java.math.BigDecimal;
import java.util.Objects;

public class Carro {
    private String numeroChassi;
    private String modelo;
    private String marca;
    private String cor;
    private TipoCombustivel combustivel;
    private Integer quantPortas;
    private BigDecimal valorHora;
    private BigDecimal valorCarro;

    public Carro(){}

    public Carro(String numeroChassi, String modelo, String marca, String cor, TipoCombustivel combustivel, Integer quantPortas, BigDecimal valorHora, BigDecimal valorCarro ){
        this.numeroChassi = numeroChassi;
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.combustivel = combustivel;
        this.quantPortas = quantPortas;
        this.valorCarro = valorCarro;
        this.valorHora = valorHora;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", combustivel=" + combustivel +
                ", quantPortas=" + quantPortas +
                ", valorHora=" + valorHora +
                ", valorCarro=" + valorCarro +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro carro)) return false;
        return Objects.equals(getModelo(), carro.getModelo()) && Objects.equals(getMarca(), carro.getMarca()) && Objects.equals(getCor(), carro.getCor()) && getCombustivel() == carro.getCombustivel() && Objects.equals(getQuantPortas(), carro.getQuantPortas());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelo(), getMarca(), getCor(), getCombustivel(), getQuantPortas());
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }
    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(TipoCombustivel combustivel) {
        this.combustivel = combustivel;
    }

    public Integer getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(Integer quantPortas) {
        this.quantPortas = quantPortas;
    }

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    public BigDecimal getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(BigDecimal valorCarro) {
        this.valorCarro = valorCarro;
    }
}
