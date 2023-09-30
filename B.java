/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

/**
 *
 * @author mustafamhemeed
 */
public class B extends Manager {
    
    private int Num_ID;
    
    public B(){
        super();
    }
    
    
    public B (String name, int age, double salary, int Num_ID){
            super( name , age , salary );
    this.Num_ID = Num_ID;
    
    }
    
    
    public void setNum_ID (int Num_ID){
        this.Num_ID = Num_ID;
    }
    
    public String toString(){
        return "B [Num_ID:" + Num_ID + "name()=" + getName() + "age: " + getAge() + "salary:" + getSalary() + "]";
    }
    
    

}

