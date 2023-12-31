public class Alquiler {
    //ATRIBUTOS
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int añoAlquiler;
    private int totalDiasAlquiler;
    //CONSTRUCTORES
    public Alquiler(){

    }
    public Alquiler(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler){
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    //METODOS GETTER Y SETTER
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    public int getDiaAlquiler(){
        return diaAlquiler;
    }
    public void setDiaAlquiler(int diaAlquiler){
        this.diaAlquiler = diaAlquiler;
    }
    public int getMesAlquiler(){
        return mesAlquiler;
    }
    public void setMesAlquiler(int mesAlquiler){
        this.mesAlquiler = mesAlquiler;
    }
    public int getAñoAlquiler(){
        return añoAlquiler;
    }
    public void setAñoAlquiler(int añoAlquiler){
        this.añoAlquiler = añoAlquiler;
    }
    public int getTotalDiasAlquiler(){
        return totalDiasAlquiler;
    }
    public void setTotalDiasAlquiler(int totalDiasAlquiler){
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

}
