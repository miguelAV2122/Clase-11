
package com.mycompany.tecnicas;
import javax.swing.*;


public class Alumno extends Persona{
    private int proyecto;
    private int examen;
    private int cotidiano;
    private String nivel;
    
    public Alumno() {
        
    }

    public Alumno(int proyecto, int examen, int cotidiano, String nivel, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.proyecto = proyecto;
        this.examen = examen;
        this.cotidiano = cotidiano;
        this.nivel = nivel;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public int getExamen() {
        return examen;
    }

    public void setExamen(int examen) {
        this.examen = examen;
    }

    public int getCotidiano() {
        return cotidiano;
    }

    public void setCotidiano(int cotidiano) {
        this.cotidiano = cotidiano;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

  public void imprimirDatos(){
      JOptionPane.showMessageDialog(null,"El nombre del alumno es: "+getNombre()
      +"\n La edad es: "+getEdad()
      +"\n El genero es: "+getGenero()
      +"\n La nota del proyecto es: "+proyecto
      +"\n La nota del primer examen es: "+examen
      +"\n El cotidiano es: "+cotidiano
      +"\n El grado del alumno es: "+nivel);
  }
  
    public static void main(String[] args) {
        Alumno notas = new Alumno();
        double suma =0, promedio, promedioTotal=0;
        int limite, i;
      
        limite = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos que desa ingresar"));
        for (i=1; i<=limite; i++) {
            
            notas.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Alumno"));
            notas.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno")));
            notas.setGenero(JOptionPane.showInputDialog("Ingrese el genero del Alumno M o F").charAt(0));
            notas.setProyecto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del proyecto")));
            notas.setExamen(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del examen")));
            notas.setCotidiano(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del cotidiano")));
            notas.setNivel(JOptionPane.showInputDialog("Ingrese el grado del Alumno"));
            promedio = (notas.getExamen()+notas.getCotidiano()+notas.getProyecto())/3;
            notas.imprimirDatos();
            JOptionPane.showMessageDialog(null,"El promedio del alumno es: "+promedio);
            suma+=promedio;
        }
        promedioTotal= suma/limite;
        JOptionPane.showMessageDialog(null,"El promedio grupal es: "+promedioTotal);
    }
    
    
}
