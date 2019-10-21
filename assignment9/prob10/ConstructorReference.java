package lesson9.prob10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };

		// Query 1 : Print only Female canditates names
		processHuman(list)
						.filter(human->human.gender.equals("Female"))
						.forEach(System.out::println);

		// Query 2 : Cretae an objecy by choosing suitable Interface to the specified
		// constructors(Totally 3 constuctors)using fouth type of Method Reference
		// ClassName::new. Then print the object status
		Function<String,Human> ob1 = Human::new;
		BiFunction<String,Integer,Human> ob2 = Human::new;
		TriFunction<String,Integer,String,Human> ob3 =  Human::new;

		List<Human> humanList = Arrays.asList(ob1.apply("Philip"),ob2.apply("Owusu",90),ob3.apply("Sarfo",34,"Female"));
		humanList.forEach(System.out::println);

		// Query 3 : Count the male candidates whose age is more than 30
		processHuman(list)
						.filter(human->human.gender.equals("Male") && human.age > 30)
						.forEach(System.out::println);

	}
	
	static Stream<Human> processHuman(Human[] human){
		return Arrays.stream(human);
	}

}
