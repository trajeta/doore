package net.bit.company;

public class SectionCheif extends Company{

	SectionCheif(){
		age = 30;
		name = "Olaf";
		department = "경영팀";
		eiNum = 20081203;
		idNum = 19950302;
		position ="과장";
	}
	
	SectionCheif(int age, String name, String department,int eiNum,int idNum,String position){
		this.age = age;
		this.name = name;
		this.department = department;
		this.eiNum = eiNum;
		this.idNum = idNum;
		this.position = position;
	}	
}
