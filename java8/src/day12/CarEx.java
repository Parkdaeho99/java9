package day12;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car("�ֿ�","���",350);
		//CarŬ������ ��ü ����(�ν��Ͻ�ȭ)�ؼ� ���� mycar�� ����
		//Ŭ������ ��üȭ�� �� ���� ����+�� �ѹ��� ����Ǵ� ������()
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		myCar.company="����";
		myCar.model="�ƹݶ�";
		myCar.color="����";
		myCar.maxSpeed=300;
		myCar.speed=100;
		
		System.out.println(myCar.company);
		System.out.println(myCar.maxSpeed);
		
		Car yourCar = new Car();
		System.out.println(yourCar.company);
		System.out.println(yourCar.maxSpeed);
		
		System.out.println("������ ����");
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.speed);
		
		Car c2 = new Car(250);
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		System.out.println(c2.speed);
		
		Car c3 = new Car("�Ķ�", 350);
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		System.out.println(c3.speed);
		
		System.out.println("�޼ҵ� �׽�Ʈ");
		c3.accel();
		c3.speed = 325;
		c3.accel();
		c3.accel();
		c3.accel();
		c3.brake();
		
	}

}