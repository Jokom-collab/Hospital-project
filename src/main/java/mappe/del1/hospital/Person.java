package mappe.del1.hospital;

public class Person
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;


 public Person(String firstName, String lastName, String socialSecurityNumber)
 {
     this.firstName = firstName;
     this.lastName = lastName;
     this. socialSecurityNumber = socialSecurityNumber;
 }


    public void setFirstName(String firstName)
    {
        if(null == firstName)
        {
            this.firstName = "Inavlid first name.. try again";
        }
        else
            {
            if(firstName.isEmpty())
            {
                this.firstName = "Invalid first name.. try again";
            }
            else
                {
                this.firstName = firstName;
            }

        }
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        if(null == socialSecurityNumber)
        {
            this.socialSecurityNumber = "Invalid person number.. try again";
        }
        else
        {
            if(socialSecurityNumber.isEmpty())
            {
                this.socialSecurityNumber = "Invalid person number.. try again";
            }
            else
            {
                this.socialSecurityNumber = firstName;
            }

        }
    }

    public void setLastName(String lastName)
    {
        if(null == lastName)
        {
            this.lastName = "Inavlid last name.. try again";
        }
        else
        {
            if(lastName.isEmpty())
            {
                this.lastName = "Invalid last name.. try again";
            }
            else
            {
                this.lastName = lastName;
            }

        }
    }

    public String getFirstName()
 {
     return this.firstName;
 }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getSocialSecurityNumber()
    {
        return this.socialSecurityNumber;
    }

    public String getFullName()
    {
        String fullName = "" + this.getFirstName()
                + " " + this.getLastName();

        return fullName;

    }


    /**
     * @return A multi-line string containing the firstname,
     * lastname, and socialsecuritynumber.
     */
public String toString()
{
 return firstName + "\n" + lastName + "\n" + socialSecurityNumber;
}




}
