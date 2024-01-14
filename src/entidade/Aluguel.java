package entidade;

import enums.TipoPagamento;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Aluguel {
    private Pessoa pessoa;
    private Carro carro;
    private BigDecimal valorTotal;
    private Integer tempoEmHoras;
    private LocalDate dataDaSaida;
    private LocalDate dataDaChegada;
    private TipoPagamento pagamento;

    public Aluguel(){
    }

    public Aluguel(Pessoa pessoa, Carro carro, BigDecimal valorTotal, Integer tempoEmHoras, LocalDate dataDaSaida, LocalDate dataDaChegada, TipoPagamento pagamento) {
        this.pessoa = pessoa;
        this.carro = carro;
        this.valorTotal = valorTotal;
        this.tempoEmHoras = tempoEmHoras;
        this.dataDaSaida = dataDaSaida;
        this.dataDaChegada = dataDaChegada;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "pessoa=" + pessoa +
                ", carro=" + carro +
                ", valorTotal=" + valorTotal +
                ", tempoEmHoras=" + tempoEmHoras +
                ", dataDaSaida=" + dataDaSaida +
                ", dataDaChegada=" + dataDaChegada +
                ", pagamento=" + pagamento +
                '}';
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getTempoEmHoras() {
        return tempoEmHoras;
    }

    public void setTempoEmHoras(Integer tempoEmHoras) {
        this.tempoEmHoras = tempoEmHoras;
    }

    public LocalDate getDataDaSaida() {
        return dataDaSaida;
    }

    public void setDataDaSaida(LocalDate dataDaSaida) {
        this.dataDaSaida = dataDaSaida;
    }

    public LocalDate getDataDaChegada() {
        return dataDaChegada;
    }

    public void setDataDaChegada(LocalDate dataDaChegada) {
        this.dataDaChegada = dataDaChegada;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

}
