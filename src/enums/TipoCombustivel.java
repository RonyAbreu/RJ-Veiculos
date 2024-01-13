package enums;

public enum TipoCombustivel {
    GASOLINA("gasolina"), ALCOOL("alcool"), FLEX("flex");
    private String tipoCombustivel;

    TipoCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;

    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}
