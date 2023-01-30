public class CuentaCorriente extends Cuenta
{
    public CuentaCorriente(int agencia, int numero)
    {
        super(agencia,numero);
    }
    
    @Override
    public boolean saca(double valor)
    {
	return valor == 1.0;
    }

    public void deposita(double valor)
    {
	System.out.print("fue depositado: " + valor);
    }
}
