/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingenierias.ucaldas.edu.co;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author daner
 */
public class Organizador {
    
    private String Nombre;
    private String Cedula;
    private String Dia;
    private String Salon;
    private int silla;

    public Organizador(String Nombre, String Cedula, String Dia, String Salon, int silla) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Dia = Dia;
        this.Salon = Salon;
        this.silla = silla;
    }

    Organizador() {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Dia = Dia;
        this.Salon = Salon;
        this.silla = silla;
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

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getSalon() {
        return Salon;
    }

    public void setSalon(String Salon) {
        this.Salon = Salon;
    }
    
    public int getsilla() {
        return silla;
    }

    public void setsilla(int silla) {
        this.silla = silla;
    }
    
    void Guardar(PrintWriter Escribe) {
        
        Escribe.println(Nombre);
        Escribe.println(Cedula);
        Escribe.println(Dia);
        Escribe.println(Salon);
        Escribe.println(silla);
        
    }

    public Organizador Cargar(BufferedReader Almacen) {
            String Nombre, Cedula, Dia, Salon;
            int silla;
            
            
        try {

            Nombre = Almacen.readLine();
            Cedula = Almacen.readLine();
            Dia = Almacen.readLine();
            Salon = Almacen.readLine();
            silla = Integer.parseInt(Almacen.readLine());
            
            return new Organizador (Nombre, Cedula, Dia, Salon, silla);
            
        } catch (Exception e) {
        }
        return null;
    }
    
}
