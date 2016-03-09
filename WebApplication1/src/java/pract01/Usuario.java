package pract01;
// Generated 1/03/2016 10:57:25 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUser;
     private Rango rango;
     private String nombre;
     private String apellido;
     private String contrasenia;
     private String correo;
     private Date fechaNacimiento;

    public Usuario() {
    }

	
    public Usuario(int idUser, String nombre, String apellido, String contrasenia) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
    }
    public Usuario(int idUser, Rango rango, String nombre, String apellido, String contrasenia, String correo, Date fechaNacimiento) {
       this.idUser = idUser;
       this.rango = rango;
       this.nombre = nombre;
       this.apellido = apellido;
       this.contrasenia = contrasenia;
       this.correo = correo;
       this.fechaNacimiento = fechaNacimiento;
    }
   
    public int getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public Rango getRango() {
        return this.rango;
    }
    
    public void setRango(Rango rango) {
        this.rango = rango;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }




}


