/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_exm_t1;

import java.util.Scanner;

/**
 *
 * @author UCA40421
 */
public class Poo_exm_T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ControladorAlumno controlador = new ControladorAlumno();

        int opcion = 0;

        do {

            System.out.println("\n==========================");
            System.out.println(" SISTEMA DE ALUMNOS");
            System.out.println("==========================");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("0. Salir");
            System.out.println("==========================");

            try {

                System.out.print("Ingrese una opcion: ");
                opcion = Integer.parseInt(teclado.nextLine());

                if (opcion == 1) {

                    System.out.println("\n===== AGREGAR ALUMNO =====");

                    System.out.print("Nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print(
                            "Tipo documento (DNI(8) O RESIDENCIA(11)): ");
                    String tipoDocumento =
                            teclado.nextLine().toUpperCase();

                    System.out.print("Numero documento: ");
                    String numeroDocumento = teclado.nextLine();

                    System.out.print("Nivel (A/B/C): ");
                    char nivel = teclado.nextLine()
                            .toUpperCase()
                            .charAt(0);

                    System.out.print(
                            "Beca (SIN BECA/PARCIAL/TOTAL): ");
                    String beca = teclado.nextLine().toUpperCase();

                    Alumno alumno = new Alumno(
                            nombre,
                            tipoDocumento,
                            numeroDocumento,
                            nivel,
                            beca
                    );

                    if (alumno.validarDocumento()) {

                        controlador.agregarAlumno(alumno);

                    } else {

                        System.out.println(
                                "ERROR: El numero de documento no es valido."
                        );
                    }

                } else if (opcion == 2) {

                    controlador.listarAlumnos();

                } else if (opcion == 0) {

                    System.out.println("Programa terminado.");

                } else {

                    System.out.println("Opcion incorrecta.");
                }

            } catch (Exception e) {

                System.out.println(
                        "ERROR: Ingrese los datos correctamente."
                );

                opcion = -1;
            }

        } while (opcion != 0);

        teclado.close();
    }
}
