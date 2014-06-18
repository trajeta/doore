package net.bit.company;
import java.util.Scanner;
class Company {
	
	int age;
	String name;
	String department;
	int eiNum;
	int idNum;
	int aIncome;
	String position;
	

	void print() {
		System.out.println("-------------------------");
		System.out.println("사원의 이름은 : " +name);
		System.out.println("사원의 직책은 : " +position);
		System.out.println("사원의 나이는 : " +age);
		System.out.println("사원의 부서는 : " + department);
		System.out.println("사원 번호는 : "+eiNum);
		System.out.println("주민등록 번호는 : "+ idNum );
		System.out.println("사원의 연봉은 : " + aIncome);
		}
	
	void aIncome(String position) {
		if (position == "사원") {
			aIncome = 20000000;
		}		
		else if (position == "과장") {
			aIncome = 30000000;
		}
		else if (position == "부장") {
			aIncome = 50000000;
		}else if (position == "마약견") {
			aIncome = 30000000;
		}else if (position == "아르바이트") {
			aIncome = 20000000;
		}
		else System.out.println("직책이 맞지않습니다.");
	}
	
	void salary(int aIncome, int salary1) {
		if(position == "사원") {
			aIncome += aIncome*(salary1*0.01);
			System.out.println(name +position+"의 올해연봉은" + aIncome +"입니다.");
		}
		else if(position == "과장"){
			aIncome += aIncome*(salary1*0.01)+2000000;
			System.out.println(name +position+"의 올해연봉은" + aIncome +"입니다.");
		}
		else if(position == "부장"){
			aIncome += aIncome*(salary1*0.01)+5000000;
			System.out.println(name +position+"의 올해연봉은" + aIncome +"입니다.");
		}else if (position == "마약견"){
			aIncome += aIncome*(salary1*0.01)-2000000;
			System.out.println(name +position+"의 올해연봉은" + aIncome +"입니다.");
		}else if (position == "아르바이트"){
			aIncome += aIncome*(salary1*0.01)-1000000;
			System.out.println(name +position+"의 올해연봉은" + aIncome +"입니다.");
		}else 
			System.out.println("직책 정보가 잘못되었습니다.");
		System.out.println();
	}
}







//
//아래 2개의 문제를 풀어보세요.
//
//--------------------------------
//
//1. 6명의 사원이 있습니다.
//2. 각 사원은 이름, 나이, 부서, 사원번호, 주민등록번호, 연봉 등의 정보를 갖고 있습니다.
//3. 1명은 부장, 2명은 과장, 3명은 평사원입니다.
//4. 부장의 초기 연봉은 5000만원, 과장은 3000만원, 평사원은 2000만원입니다.
//5. 각 사원은 매년 연봉이 조절됩니다. 연봉 인상율이 주어지면 그 인상율에 따라 연봉이 인상됩니다.
//6. 평사원은 기존 연봉에 인상율만큼 더해집니다. 과장은 인상율만큼 더해지는 것외에 200만원이 추가됩니다. 부장은 300만원이 더 추가됩니다.
//7. 이번년도는 20%만큼만 인상해볼까요?
//8. 사원은 계속 추가될 가능성이 있습니다. 아르바이트생도 입사할 수도 있겠습니다.
//9. 이런 프로그램을 만들 때 프로그램의 유지/확장성이 좋게 하려면 어떻게 만들어야 할까요?
//
//-----------------------------
//
//만약 마약탐지견 개가 회사에 들어와서 일을 하고 연봉을 받고 인상을 해야 한다면 프로그램을 어떻게 바꾸는 것이 좋을까요? 