import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees;
    private int size = 10;

    public EmployeeBook() {
        this.employees = new Employee[size];
        this.employees[0] = new Employee("Иванов Иван Иванович1", 1, 50_000);
        this.employees[1] = new Employee("Иванов Иван Иванович2", 2, 60_000);
        this.employees[2] = new Employee("Иванов Иван Иванович3", 3, 70_000);
        this.employees[3] = new Employee("Иванов Иван Иванович4", 4, 80_000);
        this.employees[4] = new Employee("Иванов Иван Иванович5", 5, 90_000);
        this.employees[5] = new Employee("Иванов Иван Иванович6", 1, 100_000);
        this.employees[6] = new Employee("Иванов Иван Иванович7", 2, 110_000);
        this.employees[7] = new Employee("Иванов Иван Иванович8", 3, 120_000);
        this.employees[8] = new Employee("Иванов Иван Иванович9", 4, 130_000);
        this.employees[9] = new Employee("Иванов Иван Иванович10", 5, 140_000);
    }

    @Override
    public String toString() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        return null;
    }

    public double salarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public String minSalaryEmployee() {
        double min = Double.MAX_VALUE;
        Employee minSalaryEmp = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < min) {
                    min = employee.getSalary();
                    minSalaryEmp = employee;
                }
            }
        }
        return minSalaryEmp.toString();
    }

    public String maxSalaryEmployee() {
        double max = Double.MIN_VALUE;
        Employee maxSalaryEmp = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > max) {
                    max = employee.getSalary();
                    maxSalaryEmp = employee;
                }
            }
        }
        return maxSalaryEmp.toString();
    }

    public double averageSalary() {
        return salarySum() / employees.length;
    }

    public void printEmployeesNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("Сотрудник: " + employee.getEmployeeName());
            }
        }
    }

    public void indexSalary() {
        double index = 0.1;
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() * (1 + index));
            }
        }
    }

    public String findMinSalaryEmployee(int department) {
        double min = Double.MAX_VALUE;
        Employee minSalaryEmp = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (employee.getSalary() < min) {
                        min = employee.getSalary();
                        minSalaryEmp = employee;
                    }
                }
            }
        }
        return minSalaryEmp.toString();
    }

    public String findMaxSalaryEmployee(int department) {
        double max = Double.MIN_VALUE;
        Employee maxSalaryEmp = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    if (employee.getSalary() > max) {
                        max = employee.getSalary();
                        maxSalaryEmp = employee;
                    }
                }
            }
        }
        return maxSalaryEmp.toString();
    }

    public double findSalarySum(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    sum += employee.getSalary();
                }
            }
        }
        return sum;
    }

    public double findSalaryAverage(int department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    count++;
                }
            }
        }
        return findSalarySum(department) / count;
    }

    public void indexSalaryDepartment(int department, double index) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    employee.setSalary(employee.getSalary() * (1 + index));
                }
            }
        }
    }

    public void toStringDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    System.out.println(employee);
                }
            }
        }
    }

    public void printLessSalary(double num) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < num) {
                    System.out.println(employee);
                }
            }
        }
    }

    public void printMoreSalary(double num) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= num) {
                    System.out.println(employee);
                }
            }
        }
    }

    public void addEmployee(String employeeName, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(employeeName, department, salary);
                employees[i] = newEmployee;
                return;
            }
        }
        System.out.println("Нельзя добавить сотрудника, закончилось место");
    }

    public void removeEmployee(String employeeName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getEmployeeName().equals(employeeName)) {
                System.out.println("Сотрудник " + employees[i].getEmployeeName() + " удален");
                employees[i] = null;
                return;
            }
        }
    }

    public void changeEmployee(String employeeName, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getEmployeeName().equals(employeeName)) {
                employees[i].setDepartment(department);
                employees[i].setSalary(salary);
                System.out.println("Сотрудник " + employees[i].getEmployeeName() + " был изменён");
                return;
            }
        }
        System.out.println("Сотрудника по имени: " + employeeName + " нет в списке");
    }

    public void printDepartment() {
        StringBuilder sb1 = new StringBuilder("Отдел 1:");
        StringBuilder sb2 = new StringBuilder("Отдел 2:");
        StringBuilder sb3 = new StringBuilder("Отдел 3:");
        StringBuilder sb4 = new StringBuilder("Отдел 4:");
        StringBuilder sb5 = new StringBuilder("Отдел 5:");
        for (int i = 0; i < employees.length; i++) {
            switch (employees[i].getDepartment()) {
                case 1:
                    sb1.append(" " + employees[i].getEmployeeName());
                    break;
                case 2:
                    sb2.append(" " + employees[i].getEmployeeName());
                    break;
                case 3:
                    sb3.append(" " + employees[i].getEmployeeName());
                    break;
                case 4:
                    sb4.append(" " + employees[i].getEmployeeName());
                    break;
                case 5:
                    sb5.append(" " + employees[i].getEmployeeName());
                    break;
            }
        }
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);
        System.out.println(sb5);

    }
}
