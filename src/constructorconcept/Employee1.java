package constructorconcept;
class Employee2
/**
 * Encapsulation in Java is a core principle of Object-Oriented Programming (OOP) that involves bundling data (variables) and the methods that operate on that data within a single unit, known as a class. 
 * It is often described as "data hiding" because it restricts direct access to an object's internal state (its variables) from outside the class.
 */
{
	private String name;
	private int age;
	public Employee2(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	//update
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class Employee1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//POST
		Employee2 e=new Employee2("priya",34);
		//GET
		System.out.println("name "+e.getName()+" age "+e.getAge());
		//PUT
		e.setName("megha");
		e.setAge(20);
		//GET
		System.out.println("name "+e.getName()+" age "+e.getAge());
	}

}

