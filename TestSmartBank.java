/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author Jason
 */
public class TestSmartBank {
    public static void main(String[] args){
        Employee em1 = new RegularEmployee("Rahim", 1001, 4500);
        Employee em2 = new ContractEmployee("Karim", 1002, 20, 100);
        Employee em3 = new Manager("Aditi", 1003, 6000, 1500);
        
        System.out.println("===SmartBank Payroll===");
        em1.displayInfo();
        em2.displayInfo();
        em3.displayInfo();
    }
}
