public class Gerente extends Funcionario implements Autenticable
{
    public Gerente(String nombre, String documento, double salario,int tipo)
    {
	super(nombre, documento, salario, tipo);
    }

    public double getBonificacion(double b)
    {
        return b;
    }

    public boolean setClave(String clave)
    {
	return clave == "whatever";
    }

    public boolean iniciarSesion(String clave)
    {
	return false;
    }
}
