package controllers;

import java.util.HashMap;
import models.Empleado;

public class EmpleadoContoller {
    private HashMap<Integer, Empleado> empleados;
    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    public void addempleado(Empleado empleado){
        empleados.put(empleado.getId(), empleado);
    }

    public Empleado getEmpleado(int id){
        return empleados.get(id);
    }

    public void imprimirEmpleados(){
        System.out.println("Los empleados son:");
        for (Empleado emple : empleados.values()) {
            System.out.println(" - "+emple);
        }
    }
}