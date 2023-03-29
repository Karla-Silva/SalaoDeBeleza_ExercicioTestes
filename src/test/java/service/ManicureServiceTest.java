package service;

import model.Cliente;
import model.Desconto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManicureServiceTest {
    ManicureService manicureService = new ManicureService();
    Desconto desconto = new Desconto();
    Cliente cliente = new Cliente(true, desconto);

    @Test
    public void fazerAsMaos_AdicionaDezNaConta(){
        //given
        int contaInicial = cliente.getConta();

        //when
        manicureService.fazerAsMaos(cliente);
        int contaFinal = cliente.getConta();

        //then
        Assertions.assertEquals(contaInicial+10, contaFinal);
    }

    @Test
    public void fazerOsPes_AdicionaQuinzeNaConta(){
        //given
        int contaInicial = cliente.getConta();

        //when
        manicureService.fazerOsPes(cliente);
        int contaFinal = cliente.getConta();

        //then
        Assertions.assertEquals(contaInicial+15, contaFinal);
    }
}
