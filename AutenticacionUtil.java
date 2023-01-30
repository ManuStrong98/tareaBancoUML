public class AutenticacionUtil
{
    protected String clave;
    
    public boolean IniciarSesion(String c){
        boolean estado=false;
        if(c.equals(clave)){
            estado=true;
        }
        return estado;
    }
    public void setClave(String clave){
        this.clave=clave;
    }
}