package net.bit.company;

public class Employee extends Company {
	
	Employee() {
		age = 22;
		name = "Jax";
		department = "�濵��";
		eiNum = 20130401;
		idNum = 19940203;
		position ="���";
	}
	

	Employee(int age, String name, String department,int eiNum,int idNum,String position){
		this.age = age;
		this.name = name;
		this.department = department;
		this.eiNum = eiNum;
		this.idNum = idNum;
		this.position = position;
	}
}
