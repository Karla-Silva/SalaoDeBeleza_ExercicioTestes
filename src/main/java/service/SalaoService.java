package service;

import model.Cliente;

public class SalaoService {

    public void corte(Cliente cliente) throws Exception {
        if(cliente.isCabeloLongo()){
            cliente.setConta(cliente.getConta() + 20);
            cliente.setCabeloLongo(false);
        }else{
            throw new Exception("O cabelo já está curto");
        }
    }

    public void escova(Cliente cliente){
        if(cliente.isCabeloLongo()){
            cliente.setConta(cliente.getConta()+50);
        }else{
            cliente.setConta(cliente.getConta()+30);
        }
    }

    public void sobrancelha(Cliente cliente){
        cliente.setConta(cliente.getConta()+25);
    }

    public void hidratacao(Cliente cliente){
        if(cliente.isCabeloLongo()){
            cliente.setConta(cliente.getConta()+25);
        }else{
            cliente.setConta(cliente.getConta()+15);
        }
    }
}
