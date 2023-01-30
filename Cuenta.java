public class Cuenta 
{
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular= new Cliente("erika", "word", "343487");
    private int total;

    public Cuenta(int agencia,int numero, double saldo, int total)
    {
	this.agencia =  agencia;
	this.numero=numero;
	this.saldo = saldo;
	this.total = total;
    }

    public Cuenta(int agencia, int numero)
    {
	this.agencia = agencia;
	this. agencia = agencia;
    }

    public void deposita(double valor)
    {

    } 

    public boolean saca(double valor)
    {
	return valor == 1.0;
    }

    public boolean transfiere(double valor,Cuenta destino)
    {
	return true;	
    }

    public double getSaldo()
    {
	return saldo;
    }

    public int getAgencia ()
    {
	return agencia;
    }

    public int getNumero()
    {
	return numero;
    }

    public Cliente getTitular()
    {
	return titular;
    }

    public int getTotal()
    {
	return total;
    }

    public void setAgencia(int agencia)
    {
	this.agencia=agencia;
    }
    public void setNumero(int numero)
    {
	this.numero = numero;
    }
    public void setTitular(Cliente titular)
    {
	this.titular=titular;
    }

}
