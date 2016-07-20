/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ernesto
 */
import java.util.List;

public class Estudiante {

    private int matricula;
    private String nombre;
    private String carrera;
    private List<Asignatura> listAsignaturas;


    public Estudiante(int matricula, String nombre, String carrera, List<Asignatura> listAsignaturas) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.listAsignaturas = listAsignaturas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Asignatura> getListAsignaturas() {
        return listAsignaturas;
    }

    public void setListAsignaturas(List<Asignatura> listAsignaturas) {
        this.listAsignaturas = listAsignaturas;
    }
}
