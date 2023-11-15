public class Main{
    public static void main(String[] args){
        //CONSTRUCTOR CREA CENTRO LA INSTANCIA DE DIRECCION
        Persona personal = new Persona("Juan Perez", 20, "calle las Gardenias", 458);
        personal.agregarDireccion("Calle Nueva", 907);

        //MOSTRAMOS LOS DATOS DE LA PERSONA, INCLUYENDO LAS DIRECCIONES
        System.out.println("Datos de la persona");
        System.out.println("Nombre: "+personal.getNombre());
        System.out.println("Edad: "+personal.getEdad());
        personal.imprimirDirecciones();
    } 
}