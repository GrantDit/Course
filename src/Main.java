public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Федор", "Петрович", "Иванов", 1, 25000);
        employees[1] = new Employee("Иван", "Петрович", "Иванов", 1, 28000);
        employees[2] = new Employee("Федор", "Иванович", "Иванов", 2, 27000);
        employees[3] = new Employee("Иван", "Иванович", "Иванов", 2, 27000);
        employees[4] = new Employee("Ксения", "Ивановна", "Иванова", 3, 22000);
        employees[5] = new Employee("Юлия", "Ивановна", "Петрова", 3, 29000);
        employees[6] = new Employee("Кирилл", "Петрович", "Иванов", 4, 30000);
        employees[7] = new Employee("Александр", "Петрович", "Иванов", 4, 42000);
        employees[8] = new Employee("Федор", "Александрович", "Иванов", 5, 35000);
        employees[9] = new Employee("Иван", "Александрович", "Иванов", 1, 45000);
        EmployeeService.printEmployeeList(employees);
        EmployeeService.calculateEmployeesSalarySummaPrint(employees);
        EmployeeService.calculateMinimumSalaryPrint(employees);
        EmployeeService.calculateMaximumSalaryPrint(employees);
        EmployeeService.averageSalaryPrint(employees);
        EmployeeService.employeesFullName(employees);

    }
} 