import java.sql.Date;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明了student类的引用wangziming
		//创建了student类的对象，通过new实例化
		//使用wangziming这个引用引出该对象
		Student wangziming = new Student();
		wangziming.number = "2033650064";
		wangziming.sex = "男";
		wangziming.name="王子铭";
		wangziming.birthday = Date.valueOf("1998-07-10");
		wangziming.exam();
		wangziming.sayHello();
    	wangziming.display();
	}

}
