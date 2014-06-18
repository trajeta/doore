package net.bit.company;
import java.util.Scanner;

public class CompanyTest  {
	public static void main(String[] args) {
		
		int person;
		int salary1;
		
		Scanner on = new Scanner(System.in);
		System.out.println("연봉인상률을입력하세요.");
		salary1= on.nextInt();
		Scanner in = new Scanner(System.in);
		System.out.println("총사원수를 입력하세요.");
		person = in.nextInt();
		
		Company[] company = new Company[person];
		
		company[0] = new Employee();
		company[1] = new Employee(20, "nunu", "기획팀", 20140425,19950103,"사원");
		company[2] = new Employee(21, "ashe", "경영팀", 20140225,19960503,"사원");
		company[3] = new SectionCheif();
		company[4] = new SectionCheif(35,"nami", "경영팀", 20090304,19670203,"과장");
		company[5] = new DepartmentHead();
		
		for(int i=0 ; i<company.length;i++) {
			company[i].aIncome(company[i].position);
			company[i].print();
			company[i].salary(company[i].aIncome,salary1);
		}
	}
}
