public class EmployeeService {
    public static void printEmployeeList(Employee[] employees) {                        //Список всех сотрудников
        System.out.println("Список всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void calculateEmployeesSalarySummaPrint(Employee[] employees) {                                         // вывожу в метод мейн
        System.out.println("Сумма заработных плат состовляет: " + calculateEmployeesSalarySumma(employees));            //Создал для того чтобы дернуть в мейн.
    }

    private static double calculateEmployeesSalarySumma(Employee[] employees) {                         //Нахожу сумму ЗП всех сотрудников
        double salarySumma = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salarySumma += employee.getSalary();
            }
        }
        //    System.out.println(" Сумма заработных плат состовляет: " + salarySumma);
        return salarySumma;
    }

    public static void calculateMinimumSalaryPrint(Employee[] employees) {                      //Вывожу в метод мейн
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() == calculateMinimumSalary(employees)) {
                    System.out.println("Сотрудник с минимальной ЗП: " + employees[i]);
                }
            }
        }
    }

    private static double calculateMinimumSalary(Employee[] employees) {                //Ищу сотрудника с минимальной ЗП
        double minSalaryEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i == 0) {
                minSalaryEmployee = employees[i].getSalary();
            }
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalaryEmployee) {
                    minSalaryEmployee = employees[i].getSalary();
                }
            }
        }
        return minSalaryEmployee;
    }

    public static void calculateMaximumSalaryPrint(Employee[] employees) {                              //Вывожу в метод мейн
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() == calculateMaximumSalary(employees)) {
                    System.out.println("Сотрудник с максимальной ЗП: " + employees[i]);
                }
            }
        }
    }

    private static double calculateMaximumSalary(Employee[] employees) {                    //Ищу сотрудника с максимальной ЗП
        double maxSalaryEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalaryEmployee) {
                    maxSalaryEmployee = employees[i].getSalary();

                }
            }
        }
        return maxSalaryEmployee;
    }

    public static void averageSalaryPrint(Employee[] employees) {
        System.out.println("Средняя заработная плата плат состовляет: " + calculateAverageSalary(employees));              // Вывожу в метод мейн
    }

    private static double calculateAverageSalary(Employee[] employees) {                        // Нахожу среднее значение ЗП
        double averageSalary;
        int element = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                element++;

            }
        }
        averageSalary = calculateEmployeesSalarySumma(employees) / element;
        return averageSalary;
    }

    public static void employeesFullName(Employee[] employees) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ФИО всех сотрудников: " + "\n");           //Создал постройку строк для ФИО
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {                                   //Проверил есть ли нулевые элементы
                String s = employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName();    //Создал строку для перебора ФИО
                stringBuilder.append(s).append("\n");                      //добавил все данные из строки s перенос на новую строку
            }

        }
        String fullName = stringBuilder.toString();
        System.out.println(fullName);

    }
}


