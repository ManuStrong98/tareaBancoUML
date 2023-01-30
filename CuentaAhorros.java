public class CuentaAhorros extends Cuenta 
{
    public CuentaAhorros (int agencia, int numero)
    {
        super(agencia, numero);
    }
    
    @Override
    public void deposita(double valor)
    {
	System.out.print("fue depositado: " + valor);
    }
}
