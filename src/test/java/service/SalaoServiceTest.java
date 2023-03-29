package service;

import model.Cliente;
import model.Desconto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaoServiceTest {
    SalaoService salaoService = new SalaoService();
    Desconto desconto = new Desconto();

    @Test
    public void lancarExceptionQuandoTentarCortarCabeloCurto(){
        Cliente cabeloCurto = new Cliente(false, desconto);

        Throwable throwable = Assertions.assertThrows(
                Exception.class, ()->salaoService.corte(cabeloCurto));

        Assertions.assertEquals("O cabelo já está curto", throwable.getMessage());
    }

    @Test
    public void cobrarCorteEDeixarCabeloCurto() throws Exception {
        //given
        Cliente cliente = new Cliente(true, desconto);

        //when
        salaoService.corte(cliente);

        //then
        Assertions.assertEquals(20, cliente.getConta());
        Assertions.assertFalse(cliente.isCabeloLongo());
    }

    @Test
    public void cobrarEscovaDeAcordoComComprimentoDoCabelo(){
        //given
        Cliente cabeloCurto = new Cliente(false, desconto);
        Cliente cabeloLongo = new Cliente(true, desconto);

        //when
        salaoService.escova(cabeloCurto);
        salaoService.escova(cabeloLongo);

        //then
        Assertions.assertEquals(30, cabeloCurto.getConta());
        Assertions.assertEquals(50, cabeloLongo.getConta());
    }

    @Test
    public void cobrarSobrancelha(){
        //given
        Cliente cliente = new Cliente(false, desconto);

        //when
        salaoService.sobrancelha(cliente);

        //then
        Assertions.assertEquals(25, cliente.getConta());
    }

    @Test
    public void cobrarHidratacaoDeAcordoComComprimentoDoCabelo(){
        //given
        Cliente cabeloCurto = new Cliente(false, desconto);
        Cliente cabeloLongo = new Cliente(true, desconto);

        //when
        salaoService.hidratacao(cabeloCurto);
        salaoService.hidratacao(cabeloLongo);

        //then
        Assertions.assertEquals(15, cabeloCurto.getConta());
        Assertions.assertEquals(25, cabeloLongo.getConta());
    }
}
