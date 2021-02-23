package mappe.del1.hospital;


import java.util.HashMap;
import java.util.List;

public class Department
{
    private String departmentName;
    private HashMap<String, Employee> employee;
    private HashMap<String, Patient> patient;
    private HashMap<String, Person> person;



    public Department(String departmentName)
    {
        this.departmentName = "";
        this.employee = new HashMap<>();
        this.patient = new HashMap<>();
        this.person = new HashMap<>();
    }


    public String getDepartmentName()
    {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        if(null == departmentName)
        {
            this.departmentName = "Invalid department.. try again";
        }
        else
        {
            if(departmentName.isEmpty())
            {
                this.departmentName = "Invalid department.. try again";
            }
            else
            {
                this.departmentName = departmentName;
            }

        }
    }

    public void addEmployees(Employee employee)
{
    // if the list does not contain the full name
    // put it in the list
    if(!this.employee.containsKey(employee.getSocialSecurityNumber()))
    {
        this.employee.put(employee.getSocialSecurityNumber(), employee);
    }

}

    public void addPatient(Patient patient)
    {
        // if the list does not contain the full name
        // put it in the list
        if(!this.patient.containsKey(patient.getSocialSecurityNumber()))
        {
            this.patient.put(patient.getSocialSecurityNumber(), patient);
        }

    }

public void remove(Person person)
{
        if(this.person.containsKey(person.getSocialSecurityNumber()))
        {
            this.person.remove(person.getSocialSecurityNumber(), person);
        }
}


public void getEmployees(List<Employee> employee)
{
    System.out.println(employee.size());

}


    /**
     * Compute a hashcode using the rules to be found in
     * "Effective Java", by Joshua Bloch.
     * @return A hashcode for the department.
     */
    public int hashCode()
    {
        int code = 17;
        code = 37 * code + departmentName.hashCode();
        return code;
    }

    /**
     * Test for content equality between two objects.
     * @param other The object to compare to this one.
     * @return true if the argument object is a set
     *              of department with matching attributes.
     */
    public boolean equals(Object other)
    {
        if(other instanceof Department) {
            Department department = (Department) other;
            return departmentName.equals(department.getDepartmentName());

        }
        else {
            return false;
        }
    }



public String toString()
{
    // ikkje ferdig. usikker.
        return getDepartmentName();
}







}