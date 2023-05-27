/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author Maxi
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegistroUsuarios {
    private final String archivoUsuarios;
    private final List<Usuario> listaUsuarios;

    public RegistroUsuarios(String archivoUsuarios) {
        this.archivoUsuarios = archivoUsuarios;
        listaUsuarios = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoUsuarios, true))) {
            writer.write( usuario.getEmail() + ", " + usuario.getContrasena());
            writer.newLine();
            System.out.println("Usuario registrado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al registrar el usuario.");
        }
    }
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public void cargarUsuarios() {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoUsuarios))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(",");
                String email = campos[0];
                String contrasena = campos[1].trim();

                Usuario usuario = new Usuario(email, contrasena);
                listaUsuarios.add(usuario);
            }
        } catch (IOException e) {
        }
    }
}
