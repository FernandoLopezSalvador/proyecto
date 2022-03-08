/*
 * 
 */
package entity;

/**
 *
 * 
 */
public class Usuario extends Persona{

    private String nombre;
    private String sexo;
    private int edad;
    private int codigo;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(String nombre, String sexo, int edad, int codigo, String contraseña) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.codigo = codigo;
        this.contraseña = contraseña;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    
}
