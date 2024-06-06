/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scripting.models;

/**
 *
 * @author fer
 */
public class Estudiante {
    private int ID;
    private String nombre;
    private int curso;

    public Estudiante(int ID, String nombre, int curso) {
        this.ID = ID;
        this.nombre = nombre;
        this.curso = curso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    
    
}
