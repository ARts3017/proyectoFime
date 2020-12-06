/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.view;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.proyecto.entidades.Login;
import com.proyecto.control.LoginControll;
/**
 *
 * @author Arturo
 */
public class LoginView implements ActionListener{
    
    JFrame frame;
    JPanel panel;
    private Label usuario;
    private Label password;
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JButton ingresar;
    
    LoginControll controlador;
    

    
    public LoginView(){
        frame=new JFrame();
        panel=new JPanel();
        
        
        usuario=new Label("Usuario");
        usuario.setBounds(10, 10, 80, 25);
        password=new Label("Password");
        password.setBounds(10, 40, 80, 25);
        
        txtUsuario=new JTextField();
        txtPassword=new JTextField();
        txtUsuario.setBounds(100, 10, 160, 25);
        txtPassword.setBounds(100, 40, 160, 25);
        
        ingresar=new JButton("Ingresar");
        ingresar.setBounds(10, 80, 160, 25);
        ingresar.addActionListener(this);
        
       
        frame.setSize(650, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        panel.setLayout(null);
        panel.add(usuario);
        panel.add(password);
        panel.add(txtUsuario);
        panel.add(txtPassword);
        panel.add(ingresar);
        
        frame.add(panel);
        
        controlador=new LoginControll();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Login login =new Login();
        login.setId(0);
        login.setUsr(txtUsuario.getText());
        login.setPwd(txtPassword.getText());
        
        
        if(login.getUsr().isEmpty() || login.getPwd().isEmpty()){
            System.out.println("EMPTY");
            
        }else {
            
            
            System.out.println("AT ACCESO en vista"+login.getUsr());
            System.out.println("AT ACCESO en vista"+login.getPwd());
            
            controlador.controladorLogin(login);
            
        }
        
        
    }
    
}
