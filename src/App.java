import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();
        empleadoContoller.addempleado(new Empleado(1, "Daniel", "Developer"));
        empleadoContoller.addempleado(new Empleado(2, "Luis", "Developer"));
        empleadoContoller.addempleado(new Empleado(3, "Peñafiel", "Tester"));
        empleadoContoller.addempleado(new Empleado(4, "Antonio", "Analyst"));
        empleadoContoller.imprimirEmpleados();
    }

    private static void runMapExample() {
        new Mapa();
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        Ejercicios ejer = new Ejercicios();
        ejer.areAnagrams("listen", "silent");

    }
}
