/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Jason
 */
public class ContractEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public double getHourlyRate(){
        return hourlyRate;
    }
    
    public int getHoursWorked(){
        return hoursWorked;
    }
    
    @Override
    public double calculatePay(){
        return getHourlyRate() * getHoursWorked();
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Type: Contract Employee");
        System.out.println("Hourly Rate: $" + getHourlyRate());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println("Total Pay: $" + calculatePay());
    }
}