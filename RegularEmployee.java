/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Jason
 */
public class RegularEmployee extends Employee{
    private double monthlySalary;
    public RegularEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    
    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    
    public double getMonthlySalary(){
        return monthlySalary;
    }
    
    @Override
    public double calculatePay(){
        return getMonthlySalary();
    }
    
    public void displayInfo(){
       super.displayInfo();
       System.out.println("Type: Regular Employee");
       System.out.println("Monthly Salary: $" + getMonthlySalary());
       System.out.println("Total Pay: $" + calculatePay());
    }
}
