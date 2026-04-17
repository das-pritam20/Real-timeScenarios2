/*
Question 2: Employee Salary Calculator
Create an Employee class (BLC Class)
Attributes:
basicSalary (private, double)
hra (private, double)
da (private, double)
taxPercentage (private, double)

Methods:
Setters & Getters for all attributes.
calculateGrossSalary() Method:
Formula: grossSalary = basicSalary + hra + da
Return Type: double

calculateNetSalary() Method:
Formula: netSalary = grossSalary
(grossSalary * taxPercentage / 100)
Return Type: double
Tester Class:
Test Case 1:
Input: basic = 20000, hra = 5000, da = 3000, tax = 10%
Expected Output: Gross Salary = 28000

Test Case 2:
Input: same as above
Expected Output: Net Salary = 25200
*/


import java.util.Scanner;
class EmployeeSalaryCalculator{
	private double basicSalary;
	private double hra;
	private double da;
	private double taxPercentage;
	double grossSalary;
	double netSalary;
	
	public void setBasicSalary(double basicSalary){
		this.basicSalary = basicSalary;
	}
	public void setHRA(double hra){
		this.hra = hra;
	}
	public void setDA(double da){
		this.da = da;
	}
	public void setTaxPercentage(double taxPercentage){
		this.taxPercentage = taxPercentage;
	}


	public double setBasicSalary(){
		return basicSalary;
	}
	public double getHRA(){
		return hra;
	}
	public double getDA(){
		return da;
	}
	public double getTaxPercentage(){
		return taxPercentage;
	}

	
	public double calculateGrossSalary(){
		grossSalary = basicSalary + hra + da;
		return grossSalary;
	}


	public double calculateNetSalary(){
		netSalary = grossSalary - (grossSalary * taxPercentage / 100.0);
		return netSalary;
	}
	
	
	public void employeeDetails(){
		System.out.println("-----Employee Details-----");
		System.out.println("Basic Salary : " + setBasicSalary());
		System.out.println("Tax Percentage : " +getTaxPercentage());
		System.out.println("HRA : " +getHRA());
		System.out.println("DA : " +getDA());
		System.out.println("Gross Salary : " +calculateGrossSalary());
		System.out.println("Net Salary : " +calculateNetSalary());
	}
}


public class Employee{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter basic salary:");
		double basicSalary = sc.nextDouble();

		System.out.println("Enter Tax Percentage:");
		double taxPercentage = sc.nextDouble();

		System.out.println("Enter HRA:");
		double hra = sc.nextDouble();

		System.out.println("Enter DA:");
		double da = sc.nextDouble();

		
		EmployeeSalaryCalculator e1 = new EmployeeSalaryCalculator();
		e1.setBasicSalary(basicSalary);
		e1.setTaxPercentage(taxPercentage);
		e1.setHRA(hra);
		e1.setDA(da);

		e1.employeeDetails();
	}
}











