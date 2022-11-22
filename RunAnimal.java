import java.util.Scanner;
public class RunAnimal {

    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	//Animal animal = new Animal();
    	
    	
    	System.out.println("Choose an Animal. Press B for Bird, C for Cat, or D for Dog ");
    	String hehe = sc.nextLine();
    	
    	if (hehe.equalsIgnoreCase("B")){
    		Bird b = new Bird();
    		b.eat();
    		b.sleep();
    		b.makesound();
    		
    	}
    	else if(hehe.equalsIgnoreCase("C")){
    		Cat c = new Cat();
    		c.eat();
    		c.sleep();
    		c.makesound();
    		
    	}
    	else if(hehe.equalsIgnoreCase("D")){
    		Dog d = new Dog();
    		d.eat();
    		d.sleep();
    		d.makesound();
    	}
    	else {
    		System.out.println("invalid input");
    	}
    		
    } 
}