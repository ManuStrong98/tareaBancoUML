public class Administrador extends Funcionario implements Autenticable
{
    private AutenticacionUtil util;
    
    public Administrador(String nombre, String documento, double salario,int tipo, AutenticacionUtil util)
    {
	super(nombre, documento, salario, tipo);
	this.util = util;
    }

    @Override
    public double getBonificacion()
    {
        return 0.0;
    }

    @Override
    public boolean setClave(String clave)
    {
	return clave == "whatever";
    }

    public boolean iniciarSesion(String clave)
    {
        if(clave.equals(clave))
        {
            return true;
        }
        return false;
    }
}
