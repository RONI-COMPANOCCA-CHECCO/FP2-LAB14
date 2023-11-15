public class Direccion{
    //ATRIBUTOS
    private String calle;
    private int numero;
    //CONSTRUCTORES
    public Direccion(){
    }
    public Direccion(String calle, int numero){
        this.calle = calle;
        this.numero = numero;
    }
    //METODOS GETTER Y SETTER
    public String getCalle(){
        return calle;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
}