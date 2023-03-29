package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClienteTest {
    @Mock
    Desconto descontoMock;

    @Test
    public void iniciarClienteComContaZero(){
        Cliente cliente = new Cliente(true, descontoMock);
        Assertions.assertEquals(0, cliente.getConta());
    }

    @Test
    public void pedirAContaCorretamente(){
        //given
        int valorMenorQueCem = 99;
        int valorMaiorOuIgualACem = 110;

        Mockito.when(descontoMock.darDesconto(valorMaiorOuIgualACem)).thenReturn(true);
        Mockito.when(descontoMock.darDesconto(valorMenorQueCem)).thenReturn(false);

        Cliente cliente = new Cliente(true, descontoMock);
        Cliente cliente2 = new Cliente(false, descontoMock);

        cliente.setConta(valorMenorQueCem);
        cliente2.setConta(valorMaiorOuIgualACem);

        //when - then
        Assertions.assertEquals(valorMenorQueCem, cliente.pedirAConta());
        Assertions.assertEquals(valorMaiorOuIgualACem-10, cliente2.pedirAConta());
    }

}
