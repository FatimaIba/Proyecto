/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author fatii
 */
public class Proyectomain {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Proyecto[] Menu;
        int tam;
        boolean num = false;
        System.out.print("De que tamaño quieres la agenta:");
        tam = sc.nextInt();
        Menu = new Proyecto[tam];
        System.out.println("----------------------------------------------");
        System.out.println("Espacio restante: " + (tam - 1));
        System.out.println("----------------------------------------------");
        for (int i = 0; i < Menu.length; i++) {
            Menu[i] = new Proyecto();
        }
        try {
            for (int i = 0; i < Menu.length; i++) {
                System.out.println("Codigo del cliente:" + 1);
                Menu[i].setcodigoCliente(sc.nextInt());
                System.out.print("Ingresa el nombre:");
                Menu[i].setnombre(bf.readLine());
                System.out.print("Introduce el apellido Paterno:");
                Menu[i].setapellidoPaterno(bf.readLine());
                System.out.print("Introducir el apellido materno:");
                Menu[i].setapellidoMaterno(bf.readLine());
                System.out.print("Ingresa el  numero de telefono:");
                Menu[i].settelefono(bf.readLine());
                System.out.print("Ingresa la direccion:");
                Menu[i].setdireccion(bf.readLine());
            }
        } catch (IOException e) {
            System.out.println();
        }
        int resp = 10;
        int resp2 = 10;
        int resp3 = 10;
        int resp4 = 10;
        while (resp != 0) {
            System.out.println("------MENU------");
            System.out.println("1. Agregar al cliente");
            System.out.println("2. Mostrar cliente ");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Cerrar sistema");
            System.out.print("Eligue una opcion: ");
            resp = sc.nextInt();
        }
        switch (resp) {
            case 1:
                System.out.print("El tamaño del arre es: " + tam);
                System.out.print("Agregar cliente: ");
                resp2 = sc.nextInt();
                if (resp2 >= 0 && resp < Menu.length) {
                    System.out.println("Codigo: " + Menu[resp2].setcodigoCliente());
                    System.out.println("Nombre: " + Menu[resp2].setnombre());
                    System.out.println("Apellido Paterno: " + Menu[resp2].setapellidoPateno());
                    System.out.println("Apellido Materno: " + Menu[resp2].setapellidoMaterno());
                    System.out.println("Telefono: " + Menu[resp2].settelefono());
                    System.out.println("Edad: " + Menu[resp2].setedad());
                    System.out.println("Direccion: " + Menu[resp2].setdireccion());
                } else {
                    System.out.println("No hay espacio en la cartera de tu agenda");
                }
                break;
            case 2:
                System.out.println("-----------Lista clientes---------- ");
                 {
                    for (Proyecto Menu : Menu) {
                        System.out.println("Codigo: " + Menu.getcodigoCliente());
                        System.out.println("Nombre: " + Menu.getnombre());
                        System.out.println("Apellido Paterno: " + Menu.getapellidoPateno());
                        System.out.println("Apellido Materno: " + Menu.getapellidoMaterno());
                        System.out.println("Telefono: " + Menu.gettelefono());
                        System.out.println("Edad: " + Menu.getedad());
                        System.out.println("Direccion: " + Menu.getdireccion());
                    }
                }
                System.out.println("----------------------------------------------");
                break;

            case 3:
                while (resp3 != 0) {
                    System.out.println("---------BUSCAR CLIENTE----------");
                    System.out.println("1. Buscar por codigo");
                    System.out.println("2. Buscar por nombre");
                    System.out.println("0. Regresar al menu anterior ");
                    System.out.println("Elige una opcion: ");
                    resp3 = sc.nextInt();
                }
                switch (resp3) {
                    case 1:
                        System.out.println("Ingresa el codigo a buscar: ");
                        int codigo = sc.nextInt();
                        if (codigo != tam) {
                            System.out.print("No se encuentra el codigo : ");
                        } else {
                            if (tam == codigo) {
                                System.out.print("Cliente encontrado");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Escribe el nombre que deseas buscar:");
                        String Num = bf.readLine();
                         {
                            String nombre = null;
                            if (Num != nombre) {
                                System.out.print("El nombre no se encuentra");
                            } else {
                                if (nombre == Num) {
                                    System.out.print("El nombre que eingresaste si se encuentra");
                                }
                            }
                        }
                        break;
                    case 0:
                        System.out.print("Gracias por usarlo:");
                }
                break;
            case 4:
                System.out.print("Has salido del programa, Gracias por usarme:");
                break;
        }
    }
}
