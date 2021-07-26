/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad_practica_obligatoria_u2_java.back;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Principal {
    
    public static void main(String[]ar)
    {
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editor;
        String sistema;
        
        Scanner sc=new Scanner(System.in);
            
            System.out.println("Ingrese el nombre: ");
            nombre=sc.nextLine();
            System.out.println("Ingrese el apellido: ");
            apellido=sc.nextLine();
            System.out.println("Ingrese su hobbie ");
            hobbie=sc.nextLine();
            System.out.println("Ingrese su editor de código preferido: ");
            editor=sc.nextLine();
            System.out.println("Ingrese el sistema operativo que utiliza: ");
            sistema=sc.nextLine();
            System.out.println("Ingrese la edad: ");
            edad=sc.nextInt();
            
            System.out.println("Su nombre es: "+nombre);
            System.out.println("Su apellido es: "+apellido);
            System.out.println("Su hobbie es: "+hobbie);
            System.out.println("Su editor de código preferido es: "+editor);
            System.out.println("El sistema operativo que utiliza es: "+sistema);
            System.out.println("Su edad es: "+edad);
            
            
            
            
            
        
    }
            
    
}
