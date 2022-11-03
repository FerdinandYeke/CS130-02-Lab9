
public class StudentClassApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentClass student1 = new StudentClass("Aaron",20,"Computer Science","Dancing",4.5,100);
		
		System.out.println("Student Name is: "+student1.getName());
		System.out.println("Student age is: "+student1.getAge());
		System.out.println("Student Major is: "+student1.getMajor());
		System.out.println("Student Hobby is: "+student1.getHobby());
		System.out.println("Student expected GPA is: "+student1.getExpected_GPA());
		System.out.println("Student hours in major of java is: "+student1.getSpent_Time_Learn_JAVA());
		System.out.println("Is Student eligible for honors? "+student1.HonorsEligible(false)); 
		
		System.out.println("");
		System.out.println("");
		
		StudentClass student2 = new StudentClass("Barron",18,"Computer Science","Boxing",3.2,50);
		System.out.println("Student Name is: "+student2.getName());
		System.out.println("Student age is: "+student2.getAge());
		System.out.println("Student Major is: "+student2.getMajor());
		System.out.println("Student Hobby is: "+student2.getHobby());
		System.out.println("Student expected GPA is: "+student2.getExpected_GPA());
		System.out.println("Student hours in major of java is: "+student2.getSpent_Time_Learn_JAVA());
		System.out.println("Is Student eligible for honors? "+student2.HonorsEligible(false)); 
		
	}

}
