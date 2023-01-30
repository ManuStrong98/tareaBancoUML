public class Cliente implements Autenticable{
    protected String nombre;
    protected String documento;
    protected String telefono;
    protected AutenticacionUtil util;    
    public Cliente (String nombre,String documento,String telefono){
        this.nombre=nombre;
        this.documento=documento;
        this.telefono=telefono;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDocumento(){
        return documento;
    }
    public String getTelefono(){
        return telefono;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDocumento(String documento){
        this.documento=documento;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
 }
