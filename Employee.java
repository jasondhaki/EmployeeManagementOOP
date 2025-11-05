/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author Jason
 */
public class Employee {
    private String name;
    private int id;
    
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }
    
    public double calculatePay(){
        return 0.0;
    }
    
    public void displayInfo(){
        System.out.println("\nEmployee ID: " + getId() + "\nName: " + getName());
    }
}
