package pet;

public class pet {
	
// INSTANCE VARIABLES
	
    private String name;
	private int age;
	private String location;
	private String type;

// TWO CONSTRUCTORS	
	
		public pet(String name) {
			this.name = name;
			System.out.println("1) " + name + "'s First Constructor\n");
		}
		
		public pet(int age, String type) {
			this.age = age;
			this.type = type;
			System.out.println("2) This is my second Constructor that "
					+ "prints: \nAge:" + age + "\nPet-Type:" + type);
		}

// Code to be able to access the following (Get Methods):
	
		public String getName() {
			return this.name;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public String getType() {
			return this.type;
		}
	
//  Code to be able to change (Set Methods):
	
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setType(String type) {
			this.type = type;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// TWO CONSTRUCTORS
		pet myPet = new pet("Ryan");
		pet myPet2 = new pet(5, "Rottweiler");
		
// GET METHODS
		String x = myPet.getName();
		int y = myPet2.getAge();
		String z = myPet2.getType();
		System.out.println("\nName: " + x + "\nAge: " + y + "\nAnimal Type: " + z);
		
// SET METHODS
	    myPet.setName("Zues");
	    myPet2.setAge(15);
	    myPet2.setType("Mastiff");
	    System.out.println("\nName: " + myPet.getName() + "\nAge: " + myPet2.getAge() + 
	    					"\nAnimal Type: " + myPet2.getType());
	}

	
}
