import java.sql.Date;
import java.util.Scanner;

public class Student {
	String number = "";
	String name = "";
	String sex = "";
	Date birthday = null;
	float score = 0;
	void student () {
		System.out.println("学习使我快乐..........");
	}
	void eat() {
		System.out.println("吃饭为了学习");
	}
	void sleep() {
		System.out.println("睡觉是为了学习");
	}
	void exam(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		score = sc.nextInt();
	}
	void sayHello() {
		System.out.println("您好！我是"+ name +"。");
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("学号:"+number+
						   "姓名:"+name+
						   "性别:"+sex+
						   "生日"+birthday+
						   "成绩:"+score);
	}

}







