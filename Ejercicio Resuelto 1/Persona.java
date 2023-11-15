import java.util.ArrayList;
public class Persona{
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private ArrayList <Direccion> direcciones;
    //CONSTRUCTORES
    public Persona(String nombre, int edad, String calle, int numero){
        this.nombre = nombre;
        this.edad = edad;
        direcciones = new ArrayList<Direccion>(); 
        Direccion direccion = new Direccion(calle,numero);
        //AGREGAMOS LA INSTANCIA DIRECCION
        direcciones.add(direccion);
    }
    //METODOS GETTER Y SETTER
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void agregarDireccion(String calle, int numero){
        //CREAMOS LA INSTANCIA DENTRO DE PERSONA - RELACION DE COMPOSICION
        Direccion direccion = new Direccion(calle,numero);
        direcciones.add(direccion);
    }
    public void imprimirDirecciones(){
        for(Direccion direccion : direcciones){
            System.out.println("Direccion: "+direccion.getCalle()+" "+direccion.getNumero());
        }
    }
}