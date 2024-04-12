package entidade;

import enums.TipoPagamento;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Compra implements Serializable {
    private Pessoa pessoa;
    private Carro carro;
    private LocalDate dataDaCompra;
    private BigDecimal valorTotal;
    private TipoPagamento pagamento;

    public Compra(){
    }

    public Compra(Pessoa pessoa, Carro carro, LocalDate dataDaCompra, BigDecimal valorTotal, TipoPagamento pagamento) {
        this.pessoa = pessoa;
        this.carro = carro;
        this.dataDaCompra = dataDaCompra;
        this.valorTotal = valorTotal;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "pessoa=" + pessoa +
                ", carro=" + carro +
                ", dataDaCompra=" + dataDaCompra +
                ", valorTotal=" + valorTotal +
                ", pagamento=" + pagamento +
                '}';
    }

    public boolean chassiEhValido(String chassi){
        return carro.getNumeroChassi().equals(chassi);
    }

    public boolean emailEhValido(String email){
        return pessoa.getEmail().equals(email);
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

    public LocalDate getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(LocalDate dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public TipoPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }
}
