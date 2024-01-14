package mock;

import entidade.*;
import enums.TipoCombustivel;
import enums.TipoDocumento;
import enums.TipoPagamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Mock {

    public static Endereco mockEndereco(){
        return new Endereco(
                "Rua nova",
                "Bairro",
                "Pirpirituba",
                "Paraiba",
                40);
    }

    public static Documento mockDocumento(){
        return new Documento(TipoDocumento.CPF, "777.666.555-44");
    }

    public static Pessoa mockPessoa(){
        Endereco endereco = mockEndereco();
        Documento documento = mockDocumento();
        return new Pessoa("Rony",
                "(83) 98877-0099",
                "rony@gmail.com",
                LocalDate.of(2001, Month.MAY, 20),
                endereco,
                documento);
    }

    public static Carro mockCarro(){
        return new Carro("111",
                "Siena",
                "Honda",
                "Preto",
                TipoCombustivel.ALCOOL,
                4,
                BigDecimal.valueOf(20),
                BigDecimal.valueOf(26.000));
    }

    public static Aluguel mockAluguel(){
        Pessoa pessoa = mockPessoa();
        Carro carro = mockCarro();
        return new Aluguel(
                pessoa,
                carro,
                BigDecimal.valueOf(200),
                4,
                LocalDate.now(),
                LocalDate.of(2024,Month.JANUARY,15),
                TipoPagamento.CREDITO);
    }

    public static Compra mockCompra(){
        Pessoa pessoa = mockPessoa();
        Carro carro = mockCarro();
        return new Compra(
                pessoa,
                carro,
                LocalDate.now(),
                BigDecimal.valueOf(200),
                TipoPagamento.CREDITO);
    }
}
