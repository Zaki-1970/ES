/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manager;

/**
 *
 * @author mustafamhemeed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
        Manager employee1 = new Manager();
        employee1.setName("Mustafa");
        employee1.setAge(22);
        employee1.setsalary(50000);
        System.out.println(employee1);
        
        Manager employee2 = new B();
        employee2.setName("Hamad");
        employee2.setAge(23);
        employee2.setsalary(9000);
        System.out.println(employee2);
       
        System.out.println(employee1 instanceof Manager);
	System.out.println(employee2 instanceof B);
        
        



    }
    
}
