package com.mycompany.proyectoing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
 
public class FormularioRegistro extends JFrame {
    private final JLabel labelNombre;
    private JTextField campoNombre;
    private final JLabel labelEmail;
    private JTextField campoEmail;
    private final JLabel labelContrasena;
    private JPasswordField campoContrasena;
    private final JLabel labelTelefono;
    private JTextField campoTelefono;
    private final JButton botonRegistrar;
    
    public FormularioRegistro() {
        InicioSesion inicio = new InicioSesion();
        inicio.setVisible(false);
        setTitle("Formulario de Registro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        labelNombre = new JLabel("Nombre:");
        campoNombre = new JTextField(20);
        labelEmail = new JLabel("Email:");
        campoEmail = new JTextField(20);
        labelContrasena = new JLabel("Contraseña:");
        campoContrasena = new JPasswordField(20);
        labelTelefono = new JLabel("Teléfono:");
        campoTelefono = new JTextField(20);
        botonRegistrar = new JButton("Registrar");
        
        panel.add(labelNombre);
        panel.add(campoNombre);
        panel.add(labelEmail);
        panel.add(campoEmail);
        panel.add(labelContrasena);
        panel.add(campoContrasena);
        panel.add(labelTelefono);
        panel.add(campoTelefono);
        panel.add(new JLabel());
        panel.add(botonRegistrar);
        
        botonRegistrar.addActionListener((ActionEvent e) -> {
            String nombre = campoNombre.getText();
            String email = campoEmail.getText();
            String contrasena = new String(campoContrasena.getPassword());
            String telefono = campoTelefono.getText();
            
            //validar campos y crear objeto Usuario
            if (nombre.trim().equals("") || email.trim().equals("") || contrasena.trim().equals("") || telefono.trim().equals("")) {
                JOptionPane.showMessageDialog(FormularioRegistro.this, "Por favor ingrese todos los campos");
            } else {
                Usuario nuevoUsuario = new Usuario(nombre, email, contrasena, telefono);
                
                
                //guardar usuario en archivo
                try {
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuarios.dat", true))) {   
                        out.writeObject(nuevoUsuario);
                    }
                    JOptionPane.showMessageDialog(FormularioRegistro.this, "Registro exitoso");
                    dispose(); //cierra el formulario de registro
                    inicio.setVisible(true);
                    this.setVisible(false);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(FormularioRegistro.this, "Error al guardar el registro: " + ex.getMessage());
                }
            }
        });
        
        add(panel);
        setVisible(true);
    }
}