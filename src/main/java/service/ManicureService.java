package service;

import model.Cliente;

public class ManicureService {
    public void fazerAsMaos(Cliente cliente){
        cliente.setConta(cliente.getConta()+10);
    }

    public void fazerOsPes(Cliente cliente){
        cliente.setConta(cliente.getConta()+15);
    }
}
