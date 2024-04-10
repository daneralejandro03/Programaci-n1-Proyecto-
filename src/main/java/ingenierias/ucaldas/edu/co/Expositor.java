/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingenierias.ucaldas.edu.co;

import java.io.BufferedReader;
import java.io.PrintWriter;


public class Expositor {
    private String Nombre;
    private String Cedula;
    private int proyector;
    private String dia;
    private String Hora;
    private String Tema;
    private int computador;
    private String Salon;

    public Expositor(String Nombre, String Cedula, int proyector, String dia, String Hora, String Tema, int computador, String Salon) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.proyector = proyector;
        this.dia = dia;
        this.Hora = Hora;
        this.Tema = Tema;
        this.computador = computador;
        this.Salon = Salon;
    }

    Expositor() {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.proyector = proyector;
        this.dia = dia;
        this.Hora = Hora;
        this.Tema = Tema;
        this.computador = computador;
        this.Salon = Salon;  
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getProyector() {
        return proyector;
    }

    public void setProyector(int proyector) {
        this.proyector = proyector;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public int getComputador() {
        return computador;
    }

    public void setComputador(int computador) {
        this.computador = computador;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String Salon) {
        this.Salon = Salon;
    }
    
        void Guardar(PrintWriter Escribe) {
        Escribe.println(Nombre);
        Escribe.println(Cedula);
        Escribe.println(proyector);
        Escribe.println(dia);
        Escribe.println(Hora);
        Escribe.println(Tema);
        Escribe.println(computador);
        Escribe.println(Salon);
    }

    public Expositor  Cargar(BufferedReader Almacen) {
        
            String Nombre;
            String Cedula; 
            int proyector;
            String dia;
            String Hora;
            String Tema; 
            int computador;
            String Salon;
            
        try {

            Nombre = Almacen.readLine();
            Cedula = Almacen.readLine();
            proyector = Integer.parseInt(Almacen.readLine());
            dia = Almacen.readLine();
            Hora = Almacen.readLine();
            Tema = Almacen.readLine();
            computador = Integer.parseInt(Almacen.readLine());
            Salon = Almacen.readLine();
            return new Expositor (Nombre, Cedula, proyector, dia, Hora, Tema, computador, Salon);
            
        } catch (Exception e) {
        }
        return null;
    }
    
}


    
    
    
    

