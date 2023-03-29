package model;

public class Desconto {
    public boolean darDesconto(int valor){
        if(valor>=100){
            return true;
        }else {
            return false;
        }
    }
}
