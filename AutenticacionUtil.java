public class AutenticacionUtil
{
    private String clave;
    
    public boolean IniciarSesion(String clave)
    {
        boolean estado = false;

        if(clave.equals(clave))
	{
            estado=true;
        }

        return estado;
    }

    public void setClave(String clave)
    {
        this.clave=clave;
    }
}
