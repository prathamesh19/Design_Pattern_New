package com.prathamesh.factorydesignpattern;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1= EmployeeFactory.getEmpInstance(EmpType.pEmp);
Employee e2= EmployeeFactory.getEmpInstance(EmpType.cEmp);
System.out.println(e1);
System.out.println(e2);
	}

}

abstract class Employee{
	abstract public int getEmpSalary();
	abstract public String getEmpName();
	@Override
	public String toString() {
		return "Employee [getEmpSalary()=" + getEmpSalary() + ", getEmpName()=" + getEmpName() + "]";
	}
	
}

class PermEmployee extends Employee{

	@Override
	public int getEmpSalary() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	public String getEmpName() {
		// TODO Auto-generated method stub
		return "permanent employee";
	}
	
}

class ContEmployee extends Employee{

	@Override
	public int getEmpSalary() {
		// TODO Auto-generated method stub
		return 20000;
	}

	@Override
	public String getEmpName() {
		// TODO Auto-generated method stub
		return "contract employee";
	}
	
}
enum EmpType{
	pEmp, cEmp
}
class EmployeeFactory{
	
	public static Employee getEmpInstance(EmpType type){
		if(type.equals(EmpType.pEmp)){
			return new PermEmployee();
		}
		else if(type.equals(EmpType.cEmp)){
			return new ContEmployee();
		}
		return null;
	}
}