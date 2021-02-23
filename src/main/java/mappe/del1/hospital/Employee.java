package mappe.del1.hospital;

public class Employee extends Person
{


    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }


 public String toString()
 {
        return getFirstName() + "\n" + getLastName() + "\n" + getSocialSecurityNumber();
 }








}
