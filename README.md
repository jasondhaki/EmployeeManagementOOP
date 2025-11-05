# SmartBank Employee Payroll System

## Description
A Java OOP project demonstrating **encapsulation, inheritance, and polymorphism**. It models a simple employee payroll system with `Employee`, `RegularEmployee`, `ContractEmployee`, and `Manager` classes. Each class overrides methods to calculate and display pay and details.

## Features
- Encapsulation with private fields and getters/setters
- Inheritance for different types of employees
- Polymorphism via overridden `calculatePay()` and `displayInfo()` methods
- Manager subclass includes bonus calculation

## Usage
1. Clone the repository:  
   `git clone <repo-url>`  
2. Navigate to the `src` folder  
3. Compile the Java files:  
   `javac *.java`  
4. Run the program:  
   `java TestSmartBank`

## Example Output
=== SmartBank Payroll ===
Employee ID: 1001
Name: Rahim
Type: Regular Employee
Monthly Salary: $4500.0
Total Pay: $4500.0

Employee ID: 1002
Name: Karim
Type: Contract Employee
Hourly Rate: $20.0
Hours Worked: 100
Total Pay: $2000.0

Employee ID: 1003
Name: Aditi
Type: Manager
Monthly Salary: $6000.0
Bonus: $1500.0
Total Pay: $7500.0

## License
This project is open-source and free to use for learning purposes.
