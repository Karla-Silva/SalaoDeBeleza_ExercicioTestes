package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescontoTest {
    Desconto desconto = new Desconto();

    @Test
    public void retornaVerdadeiroQuandoValorMaiorOuIgualACem(){
        Assertions.assertTrue(desconto.darDesconto(100));
        Assertions.assertTrue(desconto.darDesconto(101));
        Assertions.assertFalse(desconto.darDesconto(99));
    }
}
