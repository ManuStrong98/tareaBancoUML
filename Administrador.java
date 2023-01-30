public class Administrador extends Funcionario implements Autenticable
{
    protected AutenticacionUtil util;
    public Administrador(){
    }
    public double getBonificacion(){
        return 0.0;
    }
    public void setClave(String clave){
        this.util.clave=clave;
    }
    public boolean iniciarSesion(String clave){
        if(this.util.clave.equals(clave))
        {
            return true;
        }
        return false;
    }
}