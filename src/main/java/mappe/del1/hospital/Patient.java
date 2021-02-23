package mappe.del1.hospital;

public class Patient extends  Person implements Diagnosable
{
    private String diagnosis = "";

    public Patient(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }


  public String toString()
  {
        return getFirstName() + "" + getLastName() + "" + getSocialSecurityNumber();
  }



public void setDiagnosis(String diagnose)
{
    if(null == diagnosis)
    {
        this.diagnosis = "Invalid diagnosis.. try again";
    }
    else
    {
        if(diagnosis.isBlank() || diagnosis.isEmpty())
        {
            this.diagnosis = "Invalid diagnosis.. try again";
        }
        else
        {
            this.diagnosis = diagnose;
        }

    }
}











}
