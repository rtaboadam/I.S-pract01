package pract01;
// Generated 1/03/2016 10:57:25 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rango generated by hbm2java
 */
public class Rango  implements java.io.Serializable {


     private int idRango;
     private String nombreRango;
     private Set usuarios = new HashSet(0);

    public Rango() {
    }

	
    public Rango(int idRango) {
        this.idRango = idRango;
    }
    public Rango(int idRango, String nombreRango, Set usuarios) {
       this.idRango = idRango;
       this.nombreRango = nombreRango;
       this.usuarios = usuarios;
    }
   
    public int getIdRango() {
        return this.idRango;
    }
    
    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }
    public String getNombreRango() {
        return this.nombreRango;
    }
    
    public void setNombreRango(String nombreRango) {
        this.nombreRango = nombreRango;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

