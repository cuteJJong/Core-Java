
public class PolumorphismDemo3 {
	public static void main(String[] args) {
		//같은 자식끼리만 가능
//		Dog [] array = new Dog[3];
//		array[0] = new Cat();
		
		
		Mammal [] array = new Mammal[4];
		array[0] = new Dog();
		array[1] = new Cat();
		array[2] = new American();
		array[3] = new Korean();
		
		for(Mammal m : array)
			m.sayThing();
			
 	} 
}
