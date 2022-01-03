class Person {
	String name;
	int age;
	
	public Person(String name) {
		this.name = name;
	}
	public void printInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}
}
class Student extends Person{
	public Student(String name) {
		super(name);
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		Person p = new Person("이상현");
		Student s = new Student("지연쿤");
		p.printInfo();
		s.printInfo();
		s.age = 24;
		s.printInfo();

	}
}