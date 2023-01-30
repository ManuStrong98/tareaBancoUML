import java.util.*;

public class Cuenta {
    protected double saldo;
    protected int agencia=1;
    protected int numero;
    protected Cliente titular= new Cliente() ;
    protected int total;
    public Cuenta(int Agencia,int numero){
        this.agencia=agencia;
        this.numero=numero;
    }
    
    public void deposita(double valor){
        
    } 
    
    public void saca(double valor){
    
    }
    
    public void transfiere(double valor,Cuenta destino){
    
    }
    
    public double getSaldo(){
        return saldo;
    }
    public int getAgencia (){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public Cliente getTitular(){
        return titular;
    }
    public int getTotal(){
        return total;
    }
    
    public void setAgencia(int agencia){
        this.agencia=agencia;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public void setTitular(Cliente titular){
        this.titular=titular;
    }
    
}
