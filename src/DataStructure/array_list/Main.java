package DataStructure.array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> newEmployeeList = new ArrayList<>();

        newEmployeeList.add(new Employee("John", "Doe", 101));
        newEmployeeList.add(new Employee("Arjun", "Kumar", 102));
        newEmployeeList.add(new Employee("Nirankar", "Srivarstava", 103));
        newEmployeeList.add(new Employee("Sparsh", "Gupta", 104));
        newEmployeeList.add(new Employee("Yash", "Goyal", 105));
        newEmployeeList.add(new Employee("Aryan", "Pandit", 105));
        newEmployeeList.add(new Employee("Rishika", "Banda", 106));
        newEmployeeList.add(new Employee("Rishav", "Naulakha", 107));
        newEmployeeList.add(new Employee("Abhideep", "Bishui", 108));

        //newEmployeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = newEmployeeList.toArray(new Employee[newEmployeeList.size()]);
        for (Employee employee: employeeArray) {
            System.out.println(employee);
        }
        }
    }

