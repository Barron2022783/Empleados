/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos_humanos;

/**
 *
 * @author Martin
 */
public class Empleados {
    
    int Id;
    String Nombre;
    String Apellido_Paterno;
    String Apellido_Materno;
    int edad;
    String email;
    int Telefono;
    float Salario;
    String hiredate;
    
    // Metodo: son las acciones que realiza el objeto
    public void Getdetails (){
        System.out.println("No. de empleado: " + Id);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido Paterno: : " + Apellido_Paterno);
        System.out.println("Apellido Materno: " + Apellido_Materno);
        System.out.println("Edad: " + edad);
        System.out.println("Email: " + email);
        System.out.println("Numero telefonico: " + Telefono);
        System.out.println("Salario: " + Salario);
        System.out.println("Contratacion: " + hiredate);
    }
    
}
