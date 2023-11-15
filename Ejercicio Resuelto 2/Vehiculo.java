public class Vehiculo {
    //ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    //CONSTRUCTORES
    public Vehiculo(){

    }
    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    //METODOS GETTER Y SETTER
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getTarifa(){
        return tarifa;
    }
    public void setTarifa(double tarifa){
        this.tarifa = tarifa;
    }
    public boolean isDisonible(){
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
}
