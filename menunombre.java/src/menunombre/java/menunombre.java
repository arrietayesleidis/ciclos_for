/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menunombre.java;

import java.util.ArrayList;
import java.util.Scanner;

public class menunombre{

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> datos = new ArrayList<>();
            
            for (int i = 0; i < 100; i++) {
                System.out.println("Menu");
                System.out.println("1 Agregar nombre");
                System.out.println("2 Eliminar nombre");
                System.out.println("3 Actualizar nombre");
                System.out.println("4 Mostrar nombres");
                System.out.println("5 Salir");
                System.out.print("Seleccione una opcion: ");
                int op = sc.nextInt();
                sc.nextLine();
                
                switch (op) {
                    case 1 -> {
                        System.out.print("Ingrese un nombre: ");
                        String n = sc.nextLine();
                        datos.add(n);
                        System.out.println("El nombre " + n + " fue agregado exitosamente.");
                    }
                        
                    case 2 -> {
                        System.out.print("Nombre que desea borrar: ");
                        String borrar = sc.nextLine();
                        if (datos.contains(borrar)) {
                            datos.remove(borrar);
                            System.out.println("El nombre " + borrar + " fue eliminado exitosamente.");
                        } else {
                            System.out.println("El nombre " + borrar + " no fue encontrado en la lista.");
                        }
                    }
                        
                    case 3 -> {
                        System.out.print("Ingrese el nombre actual: ");
                        String viejo = sc.nextLine();
                        if (datos.contains(viejo)) {
                            System.out.print("Ingrese el nuevo nombre: ");
                            String nuevo = sc.nextLine();
                            int pos = datos.indexOf(viejo);
                            datos.set(pos, nuevo);
                            System.out.println("El nombre " + viejo + " fue actualizado a " + nuevo +"");
                        } else {
                            System.out.println("El nombre " + viejo + " no fue encontrado en la lista.");
                        }
                    }
                        
                    case 4 -> {
                        System.out.println("Lista de nombres:");
                        for (String d : datos) {
                            System.out.println("- " + d);
                        }
                    }
                        
                    case 5 -> {
                        System.out.println("Saliendo del programa...");
                        i = 100;
                    }
                        
                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                }
                
            }
        }
    }
}