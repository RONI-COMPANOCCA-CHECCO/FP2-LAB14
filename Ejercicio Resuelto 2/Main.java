import java.util.*;
public class Main {
    public static void main(String[] args){
        //COLECCION DE ALQUILERES
        ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
        //CREAMOS OBJETO VEHICULO
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VolsWagen", "GTI", "Blanco", 100.0, true);
        //CREAMOS OBJETO VEHICULO
        Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "Leon", "Negro", 80.0, true);
        //CREAMOS OBJETO CLIENTE
        Cliente cliente1 = new Cliente("29681075", "Juan", "Perez");
        //CREAMOS RELACION DE AGREGACION
        Alquiler alquiler1 = new Alquiler(cliente1, vehiculo1, 11,0,2021,2);
        Alquiler alquiler2 = new Alquiler(cliente1, vehiculo2, 15,0,2021,3);
        //ADICIONAMOS LOS ALQUILERES A LA LISTA
        alquileres.add(alquiler1);
        alquileres.add(alquiler2);
        //MOSTRAMOS LOS OBJETOS COMPUESTOS
        for(Alquiler alquiler : alquileres){
            System.out.println("----------------------------");
            System.out.println("DATOS DEL ALQUILER");
            System.out.println("----------------------------");
            System.out.println("Fecha Alquiler: "+alquiler.getDiaAlquiler()+"/"+alquiler.getMesAlquiler()+"/"+alquiler.getAñoAlquiler());
            System.out.println("Cantidad Dias: "+alquiler.getTotalDiasAlquiler());
            System.out.println("Cliente: "+alquiler.getCliente().getCodigo()+" "+alquiler.getCliente().getNombre()+" "+alquiler.getCliente().getApellidos());
            System.out.println("Vehiculo: "+alquiler.getVehiculo().getMatricula()+" "+alquiler.getVehiculo().getMarca()+" "+alquiler.getVehiculo().getModelo());
        }
    }
}
