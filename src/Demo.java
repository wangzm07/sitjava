import java.sql.Date;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������student�������wangziming
		//������student��Ķ���ͨ��newʵ����
		//ʹ��wangziming������������ö���
		Student wangziming = new Student();
		wangziming.number = "2033650064";
		wangziming.sex = "��";
		wangziming.name="������";
		wangziming.birthday = Date.valueOf("1998-07-10");
		wangziming.exam();
		wangziming.sayHello();
    	wangziming.display();
	}

}
