package enums;

public enum TipoDocumento {
    CPF("cpf"),
    CNPJ("cnpj");

    private String tipoDocumento;

    TipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }
}
