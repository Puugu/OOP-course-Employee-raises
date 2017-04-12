/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author Puugu
 */
public class Employee {
    //declare and initalize variables
    private String firstName;
    private String lastName;
    private double salary = 0.00;
    
    public void setEmployeeInfo (String firstName, String lastName, double salary){
        //this method assumes user passes all data at once
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public void setEmployeeFullName (String firstName, String lastName){
        //this method assumes user is only setting the name of the new employee
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setEmployeeFirstName (String firstName){
        //this method assumes user is setting the first of the new employee separately
        //i.e. in the event of input error, name change, etc.
        this.firstName = firstName;
    }
    
    public void setEmployeeLastName (String lastName){
        //this method assumes user is setting the last name of the new employee separately
        //i.e. in the event of input error, name change, change in marital, etc.
        this.lastName = lastName;
    }
    
    public void setEmployeeSalary (double salary){
        //this method assumes user is setting the salary of the new employee separately
        this.salary = salary;
    }
    
    public String getEmployeeFirstName(){
        //this method returns the employee's first name
        return firstName;
    }
    
    public String getEmployeeLastName(){
        //this method returns the employee's last name
        return lastName;
    }
    
    public String getEmployeeFullNameFL(){
        //this method returns the employee's full name in 'first name' 'last name' format
        String fullName = firstName+" "+lastName;
        return fullName;
    }
    
    public String getEmployeeFullNameLF(){
        //this method returns the employee's full name in 'last name' 'first name' format
        String fullName = lastName+", "+firstName;
        return fullName;
    }
    
    public double getEmployeeSalary(){
        //this method returns the employee's current salary
        return salary;
    }
}
