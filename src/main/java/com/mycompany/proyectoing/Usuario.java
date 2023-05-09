/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoing;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Maxi
 */
public class Usuario implements Serializable {

    private String nombre;
    private String email;
    private String contrasena;
    private String telefono;

    public Usuario(String email, String contrasena) {
        this.email = email;
        this.contrasena = contrasena;
    }
    
    public Usuario(String nombre, String email, String contrasena, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean validarCredenciales(String email, String contrasena) {
        
        return email == null ? this.getEmail() == null : email.equals(this.getEmail());
    }

}
