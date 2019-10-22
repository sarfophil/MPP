package lesson9.prob7a;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author SARFO PHILIP
 */
public class LambdaLibrary {
    /**
     * Lambda Library to retrieve names of employees
     * whose salary is above 100000 and lastName has
     * starts from N-Z
     * @param List<Employee>
     * @return String
     */
    public static Function<List<Employee>,String> NAMES_OF_EMPLOYEE
                            = employeesList -> employeesList.stream().filter(employee -> employee.salary > 100000)
                                        .filter(employee -> Pattern.matches("[N-Z]",String.valueOf(employee.getLastName().charAt(0))))
                                        .map(employee -> employee.getFirstName()+" "+employee.getLastName())
                                        .sorted(Comparator.comparing(employee->employee))
                                        .collect(Collectors.joining(","));
}
