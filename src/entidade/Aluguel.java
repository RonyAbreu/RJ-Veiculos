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

}
