package org.example.classes;

import java.util.List;

public class InmutableObj {
    private final int id;
    private final String nombre;
    private final Long fechaNacimiento;
    private final List<String> grandfathersNames;

    public InmutableObj(int id, String nombre, long fechaNacimiento, List<String> grandfathersNames) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.grandfathersNames = grandfathersNames;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public long getFechaNacimiento() {
        return fechaNacimiento;
    }

    public List<String> getGrandfathersNames() {
        return grandfathersNames;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", grandfathersNames=" + grandfathersNames +
                '}';
    }
}
