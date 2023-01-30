public class Cliente implements Autenticable
{
    private String nombre;
    private String documento;
    private String telefono;
    private AutenticacionUtil util;    

    public Cliente (String nombre,String documento,String telefono, AutenticacionUtil util)
    {
	this.nombre=nombre;
	this.documento=documento;
	this.telefono=telefono;
	this.util = util;
    }

    public String getNombre()
    {
	return nombre;
    }

    public String getDocumento()
    {
	return documento;
    }

    public String getTelefono()
    {
	return telefono;
    }

    public void setNombre(String nombre)
    {
	this.nombre=nombre;
    }

    public void setDocumento(String documento)
    {
	this.documento=documento;
    }

    public void setTelefono(String telefono)
    {
	this.telefono=telefono;
    }

    @Override
    public boolean iniciarSesion(String clave)
    {
	return clave == "whatever";
    }

    @Override
    public boolean setClave(String clave)
    {
	return clave == "whatever";
    }
}
