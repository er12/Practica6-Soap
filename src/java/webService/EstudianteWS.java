/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

import model.*;
/**
 *
 * @author Ernesto
 */
@WebService(serviceName = "EstudianteWS")
public class EstudianteWS {

    List<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
            
    /**
     * 
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getEstudiante")
    public Estudiante getEstudiante(@WebParam(name = "matricula") Integer matricula) {
        //TODO write your implementation code here:
        for(Estudiante e : listaEstudiante)
        {
            if(e.getMatricula()== matricula)
            {
                return e;
            }
        }
        return null;
    }

    @WebMethod(operationName = "crearEstudiante")
    public String crearEstudiante(@WebParam(name = "matricula") int matricula,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "carrera") String carrera,
            @WebParam(name = "listaAsig") List<Asignatura> listaAsignaturas) {
        
            Estudiante nuevo = new Estudiante(matricula, nombre, carrera, listaAsignaturas);
            listaEstudiante.add(nuevo);
            return "Estudiante Creado!";
       
    }
    
    @WebMethod(operationName = "modificarEstudiante")
    public boolean modificarEstudiante(@WebParam(name = "estudiante") Estudiante estudiante) {
        for(Estudiante e : listaEstudiante)
        {
            if(e.getMatricula()== estudiante.getMatricula())
            {
                e.setCarrera(estudiante.getCarrera());
                e.setNombre(estudiante.getNombre());
                e.setListAsignaturas(estudiante.getListAsignaturas());
                return true;
            }
        }
        return false;
       
    }
    
    @WebMethod(operationName = "getAllEstudiantes")
    public List<Estudiante> getAllEstudiantes(@WebParam(name = "estudiante") Estudiante estudiante) {
        return listaEstudiante;
    }
        
}
