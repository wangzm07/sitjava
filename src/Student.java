import java.sql.Date;
import java.util.Scanner;

public class Student {
	String number = "";
	String name = "";
	String sex = "";
	Date birthday = null;
	float score = 0;
	void student () {
		System.out.println("ѧϰʹ�ҿ���..........");
	}
	void eat() {
		System.out.println("�Է�Ϊ��ѧϰ");
	}
	void sleep() {
		System.out.println("˯����Ϊ��ѧϰ");
	}
	void exam(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		score = sc.nextInt();
	}
	void sayHello() {
		System.out.println("���ã�����"+ name +"��");
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ѧ��:"+number+
						   "����:"+name+
						   "�Ա�:"+sex+
						   "����"+birthday+
						   "�ɼ�:"+score);
	}

}







