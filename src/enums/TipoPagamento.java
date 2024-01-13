package enums;

public enum TipoPagamento {
    DINHEIRO("dinheiro"), PIX("pix"), CREDITO("credito"), DEBITO("debito");

    private String pagamento;

    TipoPagamento(String pagamento){
        this.pagamento = pagamento;
    }

    public String getPagamento() {
        return pagamento;
    }
}
