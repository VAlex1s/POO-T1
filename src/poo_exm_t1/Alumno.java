/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_exm_t1;

/**
 *
 * @author UCA40421
 */
public class Alumno {
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private char nivel;
    private String beca;

    public Alumno(String nombre, String tipoDocumento,
            String numeroDocumento, char nivel, String beca) {

        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nivel = nivel;
        this.beca = beca;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public char getNivel() {
        return nivel;
    }

    public String getBeca() {
        return beca;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    public boolean validarDocumento() {

        if (tipoDocumento.equals("DNI")) {
            return numeroDocumento.matches("[0-9]{8}");
        }

        if (tipoDocumento.equals("RESIDENCIA")) {
            return numeroDocumento.matches("[0-9]{11}");
        }

        return false;
    }

    public double calcularPension() {

        double pension = 0;

        switch (nivel) {
            case 'A' -> pension = 500;
            case 'B' -> pension = 400;
            case 'C' -> pension = 300;
            default -> {
            }
        }

    if (beca.equals("PARCIAL")) {
        pension = pension * 0.50;
    } else if (beca.equals("TOTAL")) {
        pension = 0;
    }

    return pension;
}

    public void mostrarAlumno() {

        System.out.println("----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo documento: " + tipoDocumento);
        System.out.println("Numero documento: " + numeroDocumento);
        System.out.println("Nivel socioeconomico: " + nivel);
        System.out.println("Beca: " + beca);
        System.out.println("Pension: S/ " + calcularPension());
        System.out.println("----------------------------");
    }
}