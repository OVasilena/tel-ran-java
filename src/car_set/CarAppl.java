package car_set;

public class CarAppl {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.setAutoManufacturer("Audi");
		car1.setModel("A4 Allroad");
		car1.setCapacity(5);
		car1.setMaxSpeed(246);
		car1.setPower(249);
		
		Car car2=new Car();
		car2.setAutoManufacturer("BMW");
		car2.setModel("M850i Steptronic");
		car2.setCapacity(4);
		car2.setMaxSpeed(250);
		car2.setPower(530);
		
		Car car3=new Car();
		car3.setAutoManufacturer("Gas");
		car3.setModel("Chaika");
		car3.setCapacity(7);
		car3.setPower(195);
		car3.setMaxSpeed(160);
		
		Car car4=new Car();
		car4.setAutoManufacturer("Sachsenring Automobilwerke");
		car4.setModel("Trabant P601");
		car4.setCapacity(4);
		car4.setMaxSpeed(100);
		car4.setPower(26);
		
		Car car5=new Car();
		car5.setAutoManufacturer("Tesla Motors");
		car5.setModel("Model S");
		car5.setCapacity(5);
		car5.setPower(416);
		car5.setMaxSpeed(209);

		car1.display();
		car5.display();
		
		Car [] arr1= new Car[5];
		arr1[0]=car1;
		arr1[1]=car2;
		arr1[2]=car3;
		arr1[3]=car4;
		arr1[4]=car5;
		
		Car.printArray(arr1);
		
		
		

	}
}


