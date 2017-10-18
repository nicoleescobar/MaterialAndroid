package com.example.android.personasmaterial;

/**
 * Created by android on 17/10/2017.
 */

public class Persona {
    private int foto;
    private int cc;
    private String nombre;
    private String apellido;
    private int sexo;

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Persona(int foto, String nombre, String apellido, int sexo, int cc) {
        this.foto = foto;
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
