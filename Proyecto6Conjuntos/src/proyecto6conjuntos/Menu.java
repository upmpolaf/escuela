/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto6conjuntos;

import java.util.Scanner;

/**
 *
 * @author AbrahamDavid
 */
public class Menu {
    Operaciones op = new Operaciones();
    Scanner leer = new Scanner(System.in);
    public void menu(){
        
        String opcion ;
        do{
            System.out.println("Que dese hacer?");
            System.out.println("1.- Union");
            System.out.println("2.- Interseccion");
            System.out.println("3.- Diferencia");
            System.out.println("4.- Difeencia Simetrica");
            System.out.println("5.- Salir");
            opcion = leer.nextLine();
            if(opcion.equals("1")){
                op.union(op.A, op.B);
            }
            if(opcion.equals("2")){
                op.interseccion(op.A, op.B);
            }
            if(opcion.equals("3")){
                op.diferencia(op.A, op.B);
            }
            if(opcion.equals("4")){
                op.diferenciaSimetrica(Operaciones.A, Operaciones.B);
            }
            if(op.equals("5")){
                System.exit(3);
            }
        }while(true);
    }
            
}
