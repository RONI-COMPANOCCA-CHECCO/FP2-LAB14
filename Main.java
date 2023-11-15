import java.util.Scanner;

public class Main {
    static Scanner consola = new Scanner(System.in);
    public Persona crearTitular(){
        Persona persona;
        System.out.println("Ingrese el nombre: ");
        String nombre = consola.next();
        System.out.println("Ingrese el DNI: ");
        String dni = consola.next();
        System.out.println("Ingrese la Direccion: ");
        String direccion = consola.next();
        persona = new Persona(dni, nombre, direccion);//CREAMOS INSTANCIA
        return persona; // DEVOLVEMOS LA INSTANCIA
    }
    public Deposito crearDeposito(int tipo){
        System.out.println("-------\nNUEVO DEPOSITO----------");
        System.out.println("DATOS DEL TITULAR\n-----");
        Persona persona = crearTitular();
        System.out.println("DATOS DE DEPOSITO\n------");
        System.out.println("Ingrese el Capital: ");
        double capital = consola.nextDouble();
        System.out.println("Ingrese el plazo Dias: ");
        int plazo = consola.nextInt();
        System.out.println("Ingrese el tio de interes: ");    
    }
}
