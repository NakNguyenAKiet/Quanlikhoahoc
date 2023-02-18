/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author nakng
 */
public class Department {

    public Department(int DepartmentID, String Name, String StartDate, double Budget, int Adminstrator) {
        this.DepartmentID = DepartmentID;
        this.Name = Name;
        this.StartDate = StartDate;
        this.Budget = Budget;
        this.Adminstrator = Adminstrator;
    }

    
    
    public Department() {
    }
    
    

    public int getDepartmentID() {
        return DepartmentID;
    }

    public void setDepartmentID(int DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public double getBudget() {
        return Budget;
    }

    public void setBudget(double Budget) {
        this.Budget = Budget;
    }

    public int getAdminstrator() {
        return Adminstrator;
    }

    public void setAdminstrator(int Adminstrator) {
        this.Adminstrator = Adminstrator;
    }
    private int DepartmentID;
    private String Name;
    private String StartDate;
    private double Budget;
    private int Adminstrator;
    
    
}
