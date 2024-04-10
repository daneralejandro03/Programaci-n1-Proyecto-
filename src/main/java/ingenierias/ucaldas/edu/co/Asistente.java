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
public class Asistente {
    private String Nombre;
    private String Cedula;
    private String Dia;
    private int edad;
    private String silla;
    
    public Asistente(String Nombre, String Cedula, int edad, String silla, String Dia) {
        this.Nombre = Nombre;
        this.Dia = Dia;
        this.Cedula = Cedula;
        this.edad = edad;
        this.silla = silla;
    }

    Asistente() {
        this.Nombre = Nombre;
        this.Dia = Dia;
        this.Cedula = Cedula;
        this.edad = edad;
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
        this.Dia  = Dia;
    }

    public int getedad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
        public String getsilla() {
        return silla;
    }

    public void setsilla(String silla) {
        this.silla = silla;
    }
    


    void Guardar(PrintWriter Escribe) {
        Escribe.println(Nombre);
        Escribe.println(Cedula);
        Escribe.println(edad);
        Escribe.println(silla);
        Escribe.println(Dia);
    }

    public Asistente Cargar(BufferedReader Almacen) {
        
            String Nombre, Cedula, silla, Dia;
            int edad;
            
        try {

            Nombre = Almacen.readLine();
            Cedula = Almacen.readLine();
            edad = Integer.parseInt(Almacen.readLine());
            silla = Almacen.readLine();
            Dia = Almacen.readLine();
            
            return new Asistente (Nombre, Cedula, edad, silla, Dia);
            
        } catch (Exception e) {
        }
        return null;
    }
    
}
