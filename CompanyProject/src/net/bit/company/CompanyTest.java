package net.bit.company;
import java.util.Scanner;

public class CompanyTest  {
	public static void main(String[] args) {
		
		int person;
		int salary1;
		
		Scanner on = new Scanner(System.in);
		System.out.println("�����λ�����Է��ϼ���.");
		salary1= on.nextInt();
		Scanner in = new Scanner(System.in);
		System.out.println("�ѻ������ �Է��ϼ���.");
		person = in.nextInt();
		
		Company[] company = new Company[person];
		
		company[0] = new Employee();
		company[1] = new Employee(20, "nunu", "��ȹ��", 20140425,19950103,"���");
		company[2] = new Employee(21, "ashe", "�濵��", 20140225,19960503,"���");
		company[3] = new SectionCheif();
		company[4] = new SectionCheif(35,"nami", "�濵��", 20090304,19670203,"����");
		company[5] = new DepartmentHead();
		
		for(int i=0 ; i<company.length;i++) {
			company[i].aIncome(company[i].position);
			company[i].print();
			company[i].salary(company[i].aIncome,salary1);
		}
	}
}
