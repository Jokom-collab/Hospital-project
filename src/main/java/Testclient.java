import mappe.del1.hospital.Department;
import mappe.del1.hospital.Employee;

public class Testclient
{
    public static void main(String[] args)
    {
        Department department = new Department("Surgon");

        Employee employee = new Employee("Joslom", "Burgen", "9994");
        Employee employee1 = new Employee("Me gusta", "Turgen", "1234");

        department.addEmployees(employee);
        department.addEmployees(employee1);

















    }

}
