/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Jason
 */
public class Manager extends RegularEmployee{
    private double bonus;
    Manager(String name, int id, double monthlySalary, double bonus){
        super(name, id, monthlySalary);
        this.bonus = bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    public double getBonus(){
        return bonus;
    }
    
    public double calculatePay(){
        return super.getMonthlySalary() + getBonus();
    }
    
    public void displayInfo(){
        System.out.println("\nEmployee ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Type: Manager");
        System.out.println("Monthly Salary: $" + getMonthlySalary());
        System.out.println("Bonus: $" + getBonus());
        System.out.println("Total Pay: $" + calculatePay());
    }
}
