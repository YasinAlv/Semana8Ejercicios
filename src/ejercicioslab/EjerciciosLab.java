/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class EjerciciosLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu();
    }

    //********************************************************************
    public static void Menu() {

        int op;
        String nombre, apellido, sexo, horario;
        int edad, nota;
        Scanner Teclado = new Scanner(System.in);
        List<Persona> personas = new ArrayList<Persona>();

        do {
            System.out.println("    Opciones");
            System.out.println("    1) Ingresar persona");
            System.out.println("    2) Ingresar Estudiante");
            System.out.println("    3) Ingresar Profesor");
            System.out.println("    4) Imprimir las personas de la lista");
            System.out.println("    5) Salir");
            System.out.println("Digite una opción");

            op = Teclado.nextInt();
            Persona persona = new Persona();////////POLIMORFISMO
            Persona estudiante = new Estudiante();////////POLIMORFISMO
            Profesor profesor = new Profesor();////////POLIMORFISMO

            switch (op) {
                case 1:

                    System.out.println("Digite el Nombre de la persona");
                    nombre = Teclado.next();
                    persona.setNombre(nombre);
                    System.out.println("Digite su apellido");
                    apellido = Teclado.next();
                    persona.setApellido(apellido);
                    System.out.println("Digite su sexo");
                    sexo = Teclado.next();
                    persona.setSexo(sexo);
                    System.out.println("Digite su edad");
                    edad = Teclado.nextInt();
                    persona.setEdad(edad);
                    persona.SetEstado("Civil");

                    System.out.println("***********************************");
                    System.out.print("Su nombre es: ");
                    System.out.println(persona.getNombre());
                    System.out.print("Su apellido es: ");
                    System.out.println(persona.getApellido());
                    System.out.print("Su Sexo es: ");
                    System.out.println(persona.getSexo());
                    System.out.print("Su edad es: ");
                    System.out.println(persona.getEdad());
                    System.out.println("***********************************");
                    personas.add(persona);
                    break;

                case 2:
                    System.out.println("Digite el Nombre del estudiante");
                    nombre = Teclado.next();
                    estudiante.setNombre(nombre);
                    System.out.println("Digite su apellido");
                    apellido = Teclado.next();
                    estudiante.setApellido(apellido);
                    System.out.println("Digite su sexo");
                    sexo = Teclado.next();
                    estudiante.setSexo(sexo);
                    System.out.println("Digite su edad");
                    edad = Teclado.nextInt();
                    estudiante.setEdad(edad);
                    System.out.println("Digite su nota");
                    nota = Teclado.nextInt();
                    ((Estudiante) estudiante).setNota(nota);
                    estudiante.SetEstado("Estudiante");
                    personas.add(estudiante);
                    break;
                case 3:
                    System.out.println("Digite el Nombre del Profesor");
                    nombre = Teclado.next();
                    profesor.setNombre(nombre);
                    System.out.println("Digite su apellido");
                    apellido = Teclado.next();
                    profesor.setApellido(apellido);
                    System.out.println("Digite su sexo");
                    sexo = Teclado.next();
                    profesor.setSexo(sexo);
                    System.out.println("Digite su edad");
                    edad = Teclado.nextInt();
                    profesor.setEdad(edad);
                    System.out.println("Digite su horario");
                    horario = Teclado.next();
                    profesor.setHorario(horario);
                    profesor.SetEstado("Profesor");
                    personas.add(profesor);
                    break;

                case 4:
                    printPersonas(personas);
            }
        } while (op != 5);

    }

    //************************************************************************************
    private static void printPersonas(List<Persona> personas) {
        for (Persona persona : personas) {   //for each

            if (persona.getEstado() == "Civil") {
                System.out.println(persona.getNombre() + " "
                        + persona.getApellido() + " "
                        + persona.getEdad() + " "
                        + persona.getSexo());
            } else if (persona.getEstado() == "Estudiante") {
                System.out.println(persona.getNombre() + " "
                        + persona.getApellido() + " "
                        + persona.getEdad() + " "
                        + persona.getSexo() + " "
                        + ((Estudiante) persona).getNota());
            } else {
                System.out.println(persona.getNombre() + " "
                        + persona.getApellido() + " "
                        + persona.getEdad() + " "
                        + persona.getSexo() + " "
                        + ((Profesor) persona).getHorario());
            }
        }
    }
}
