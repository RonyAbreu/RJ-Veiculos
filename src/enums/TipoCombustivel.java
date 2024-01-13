package enums;

public enum TipoCombustivel {
    GASOLINA("gasolina"), ALCOOL("alcool"), FLEX("flex");
    private String combustivel;

    TipoCombustivel(String combustivel){
        this.combustivel = combustivel;

    }

    public String getCombustivel() {
        return combustivel;
    }
}
