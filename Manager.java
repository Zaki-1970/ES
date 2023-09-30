/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manager;

/**
 *
 * @author mustafamhemeed
 */
public class Manager {
    
    private String name;
    private int age;
    private double salary;
    
    
    public Manager(String name, int age, double salary) {
        
        this.name = name;
        this.age = age;
        this.salary = salary;
           
    }
    
    public Manager(){}
    

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setsalary(double salary){
        this.salary = salary; 
    }
    
  public String toString(){
        return "Manager[  name:" + getName() + ",age: " + getAge() + ",salary" + getSalary() + "]";
    }
    
    
}
    


    

