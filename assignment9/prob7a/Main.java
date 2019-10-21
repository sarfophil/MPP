package lesson9.prob7a;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
		//a
		String names = list.stream().filter(employee -> employee.salary > 100000)
									 .filter(employee -> Pattern.matches("[N-Z]",String.valueOf(employee.getLastName().charAt(0))))
									 .map(employee -> employee.getFirstName()+" "+employee.getLastName())
				                     .sorted(Comparator.comparing(employee->employee))
									 .collect(Collectors.joining(","));
	    System.out.println(names);

	    //b. Using a lambda Library
		String lambda = LambdaLibrary.NAMES_OF_EMPLOYEE.apply(list);
		System.out.println(lambda);
	}

}
