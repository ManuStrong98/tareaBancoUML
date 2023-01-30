public class Contador extends Funcionario
{
    public Contador(String nombre, String documento, double salario,int tipo)
    {
	super(nombre, documento, salario, tipo);
    }

   @Override 
    public double getBonificacion()
    {
	return 1.0;
    }
}
