package net.bit.company;

public class DepartmentHead extends Company {
	
		DepartmentHead(){
			age = 40;
			name = "Zed";
			department  = "±‚»π∆¿";
			eiNum = 20020303;
			idNum = 19800405;
			position ="∫Œ¿Â";
		}

		DepartmentHead(int age, String name, String department,int eiNum,int idNum,String position){
			this.age = age;
			this.name = name;
			this.department = department;
			this.eiNum = eiNum;
			this.idNum = idNum;
			this.position = position;
		}	
}
