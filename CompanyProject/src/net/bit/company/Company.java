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
	String aaa;

	void print() {
		System.out.println("-------------------------");
		System.out.println("����� �̸��� : " +name);
		System.out.println("����� ��å�� : " +position);
		System.out.println("����� ���̴� : " +age);
		System.out.println("����� �μ��� : " + department);
		System.out.println("��� ��ȣ�� : "+eiNum);
		System.out.println("�ֹε�� ��ȣ�� : "+ idNum );
		System.out.println("����� ������ : " + aIncome);
		}
	
	void aIncome(String position) {
		if (position == "���") {
			aIncome = 20000000;
		}		
		else if (position == "����") {
			aIncome = 30000000;
		}
		else if (position == "����") {
			aIncome = 50000000;
		}else if (position == "�����") {
			aIncome = 30000000;
		}else if (position == "�Ƹ�����Ʈ") {
			aIncome = 20000000;
		}
		else System.out.println("��å�� �����ʽ��ϴ�.");
	}
	
	void salary(int aIncome, int salary1) {
		if(position == "���") {
			aIncome += aIncome*(salary1*0.01);
			System.out.println(name +position+"�� ���ؿ�����" + aIncome +"�Դϴ�.");
		}
		else if(position == "����"){
			aIncome += aIncome*(salary1*0.01)+2000000;
			System.out.println(name +position+"�� ���ؿ�����" + aIncome +"�Դϴ�.");
		}
		else if(position == "����"){
			aIncome += aIncome*(salary1*0.01)+5000000;
			System.out.println(name +position+"�� ���ؿ�����" + aIncome +"�Դϴ�.");
		}else if (position == "�����"){
			aIncome += aIncome*(salary1*0.01)-2000000;
			System.out.println(name +position+"�� ���ؿ�����" + aIncome +"�Դϴ�.");
		}else if (position == "�Ƹ�����Ʈ"){
			aIncome += aIncome*(salary1*0.01)-1000000;
			System.out.println(name +position+"�� ���ؿ�����" + aIncome +"�Դϴ�.");
		}else 
			System.out.println("��å ������ �߸��Ǿ����ϴ�.");
		System.out.println();
	}
}







//
//�Ʒ� 2���� ������ Ǯ�����.
//
//--------------------------------
//
//1. 6���� ����� �ֽ��ϴ�.
//2. �� ����� �̸�, ����, �μ�, �����ȣ, �ֹε�Ϲ�ȣ, ���� ���� ������ ���� �ֽ��ϴ�.
//3. 1���� ����, 2���� ����, 3���� �����Դϴ�.
//4. ������ �ʱ� ������ 5000����, ������ 3000����, ������ 2000�����Դϴ�.
//5. �� ����� �ų� ������ �����˴ϴ�. ���� �λ����� �־����� �� �λ����� ���� ������ �λ�˴ϴ�.
//6. ������ ���� ������ �λ�����ŭ �������ϴ�. ������ �λ�����ŭ �������� �Ϳܿ� 200������ �߰��˴ϴ�. ������ 300������ �� �߰��˴ϴ�.
//7. �̹��⵵�� 20%��ŭ�� �λ��غ����?
//8. ����� ��� �߰��� ���ɼ��� �ֽ��ϴ�. �Ƹ�����Ʈ���� �Ի��� ���� �ְڽ��ϴ�.
//9. �̷� ���α׷��� ���� �� ���α׷��� ����/Ȯ�强�� ���� �Ϸ��� ��� ������ �ұ��?
//
//-----------------------------
//
//���� ����Ž���� ���� ȸ�翡 ���ͼ� ���� �ϰ� ������ �ް� �λ��� �ؾ� �Ѵٸ� ���α׷��� ��� �ٲٴ� ���� �������? 