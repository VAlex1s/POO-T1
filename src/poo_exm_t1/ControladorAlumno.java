/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_exm_t1;

import java.util.ArrayList;




/**
 *
 * @author UCA40421
 */
public class ControladorAlumno {
    private ArrayList<Alumno> lista;

    public ControladorAlumno() {
        lista = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {

        lista.add(alumno);

        System.out.println("Alumno agregado correctamente.");
    }

    public void listarAlumnos() {

        if (lista.size() == 0) {

            System.out.println("No hay alumnos registrados.");

        } else {

            System.out.println("\n===== LISTA DE ALUMNOS =====");

            for (Alumno alumno : lista) {

                alumno.mostrarAlumno();
            }
        }
    }
}
