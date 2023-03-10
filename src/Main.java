public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.toString();
        System.out.println("employeeBook.salarySum() = " + employeeBook.salarySum());
        System.out.println("employeeBook.minSalaryEmployee() = " + employeeBook.minSalaryEmployee());
        System.out.println("employeeBook.maxSalaryEmployee() = " + employeeBook.maxSalaryEmployee());
        System.out.println("employeeBook.averageSalary() = " + employeeBook.averageSalary());
        employeeBook.printEmployeesNames();
        System.out.println("employeeBook.findMinSalaryEmployee(1) = " + employeeBook.findMinSalaryEmployee(1));
        System.out.println("employeeBook.findMaxSalaryEmployee(1) = " + employeeBook.findMaxSalaryEmployee(1));
        System.out.println("employeeBook.findSalarySum(1) = " + employeeBook.findSalarySum(1));
        System.out.println("employeeBook.findSalaryAverage(1) = " + employeeBook.findSalaryAverage(1));
        employeeBook.indexSalaryDepartment(1, 0.1);
        employeeBook.toStringDepartment(1);
        System.out.println();
        employeeBook.printLessSalary(100_000);
        System.out.println();
        employeeBook.printMoreSalary(100_000);
        employeeBook.addEmployee("Иванов Иван Иванович11", 1, 10_000);
        employeeBook.removeEmployee("Иванов Иван Иванович1");
        System.out.println();
        employeeBook.addEmployee("Иванов Иван Иванович11", 1, 10_000);
        employeeBook.printEmployeesNames();
        System.out.println();
        employeeBook.changeEmployee("Пётр",1, 500_000);
        employeeBook.changeEmployee("Иванов Иван Иванович11", 2, 60_000);
        employeeBook.toString();
        System.out.println();
        employeeBook.printDepartment();
    }
}