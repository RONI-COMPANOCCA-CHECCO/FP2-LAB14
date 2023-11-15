public class Cliente{
    //ATRIBUTOS
    private String codigo;
    private String nombre;
    private String apellidos;
    //CONSTRUCTORES
    public Cliente(){
    }
    public Cliente(String codigo, String nombre, String apellidos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    //METODOS GETTER Y SETTER
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
}