import java.util.Objects;

public class Employee {
    private static int counter = 1;              // Начнет отчет с 1;
    private final int id;                       //Порядковый номер
    private final String firstName;                      //Имя
    private final String middleName;                     //Отчество
    private final String lastName;                      //Фамилия
    private int department;                      //Отдел
    private double salary;                      //ЗП

    public Employee(String firstName, String middleName, String lastName, int department, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        if (checkDepartment(department)) {
            this.department = department;
        }
        this.salary = salary;
        id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    private boolean checkDepartment(int department) {
        if (department > 5 || department <= 0) {
            throw new IllegalArgumentException("Отдел должен быть равен от 1 до 5");
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Порядковый номер: " + id + ", ФИО сотрудника: " + lastName + " " + firstName + " " + middleName + ", отдел " + department + ", Заработная плата: " + salary + " рублей ";
    }

}

