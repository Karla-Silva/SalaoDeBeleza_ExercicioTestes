package model;

public class Cliente {
    private boolean cabeloLongo;
    private int conta;
    private Desconto desconto;

    public Cliente(boolean cabeloLongo, Desconto desconto) {
        this.cabeloLongo = cabeloLongo;
        this.desconto = desconto;
        this.conta = 0;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public boolean isCabeloLongo() {
        return cabeloLongo;
    }

    public void setCabeloLongo(boolean cabeloLongo) {
        this.cabeloLongo = cabeloLongo;
    }

    public int pedirAConta(){
        if(desconto.darDesconto(getConta())){
            setConta(getConta()-10);
        }
        return getConta();
    }

}
