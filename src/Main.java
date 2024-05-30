//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich", 1, 10000);
        employees[1] = new Employee("Petrov", "Alexander", "Alexandrovich", 2, 5000);
        employees[2] = new Employee("Sidorov", "Sergey", "Sergeevich", 3, 12000);
        employees[3] = new Employee("Kuznezov", "Dmitry", "Dmitrievich", 4, 6000);
        employees[4] = new Employee("Smirnov", "Andrey", "Andreevich", 5, 13000);
        employees[5] = new Employee("Sokolov", "Evgeni", "Antonovich", 1, 7000);
        employees[6] = new Employee("Vasilev", "Vladimir", "Vladimirovich", 2, 14000);
        employees[7] = new Employee("Popov", "Mihail   ", "Mihailovich", 3, 8000);
        employees[8] = new Employee("Mihailova", "Elena", "Alexeevna", 4, 15000);
        employees[9] = new Employee("Volkov", "Maxim", "Evgenievich", 5, 9000);

        printEmployees(employees);
        System.out.println("Сотрудник с минимальной зарплатой : " + findEmployeeWithMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой: " + findEmployeeWithMaxSalary(employees));
        System.out.println("Сумма затрат на зарплаты работников: " + calculateTotalSalary(employees));
        System.out.println("Средняя зарплата: " + calculateAverageSalary(employees));
        printAllEmployeeNames(employees);
    }

    public static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }

    public static double calculateTotalSalary(Employee[] employees) {
        double total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                total = total + employees[i].getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee minSalaryEmployee = employees[0];
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0;
        int recount = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary += employees[i].getSalary();
                recount++;
            }
        }
        if (recount > 0) {
            return totalSalary / recount;
        } else {
            return 0;
        }
    }

    public static void printAllEmployeeNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getLastName() + " " + employees[i].getName() + " " + employees[i].getSurName());
            }
        }
    }

}