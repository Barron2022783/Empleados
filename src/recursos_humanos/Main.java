/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos_humanos;

import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class Main {
    
    public static void main(String[] args) {
        
        Empleados e1 = new  Empleados();
        Empleados e2 = new  Empleados();
        
        /*e1.Id = 1;
        e1.Nombre = "Tiburcio";
        e1.Apellido_Paterno = "Sanchez";
        e1.Apellido_Materno = "Mora";
        e1.edad = 30;
        e1.email = "Tiburcio@cesba.edu.mx";
        e1.Telefono = 2101616;
        e1.Salario = 30000.00f;
        e1.hiredate = "24/07/2021";*/
        
        
        /*e2.Id = 2;
        e2.Nombre = "Luis";
        e2.Apellido_Paterno = "Rodriguez";
        e2.Apellido_Materno = "Salas";
        e2.edad = 30;
        e2.email = "Luis@cesba.edu.mx";
        e2.Telefono = 23607246;
        e2.Salario = 20000.00f;
        e2.hiredate = "01/07/2021";*/
        
        //codigo por medio de ventanas de dialogo
        e1.Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleado"));
        e1.Nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        e1.Apellido_Paterno = JOptionPane.showInputDialog("Ingrese el apellido");
        e1.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        e1.email = JOptionPane.showInputDialog("Ingrese el correo");
        e1.Telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de telefono"));
        e1.Salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
        e1.hiredate = JOptionPane.showInputDialog("La fecha de contratación");
        
        /*e2.Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleado"));
        e2.Nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        e2.Apellido_Paterno = JOptionPane.showInputDialog("Ingrese el apellido");
        e2.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        e2.email = JOptionPane.showInputDialog("Ingrese el correo");
        e2.Telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de telefono"));
        e2.Salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
        e2.hiredate = JOptionPane.showInputDialog("La fecha de contratación");*/
        
        
        e1.GetDetails();
        //e2.GetDetails();
    }
    
}
