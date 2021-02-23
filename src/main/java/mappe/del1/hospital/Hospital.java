package mappe.del1.hospital;

import java.util.HashMap;

public class Hospital
{
    private final String hospitalName;
    private HashMap<String, Department> department;

    public Hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
    }

    public String getHospitalName()
    {
        return this.hospitalName;
    }

    public void addDepartment(Department department)
    {
        if(!this.department.containsKey(department.getDepartmentName()))
        {
            this.department.put(department.getDepartmentName(), department);
        }
    }


   public String toString()
   {
       //er ikkje ferdig. eg trur eg må også ha heile lista som ein string.
        return getHospitalName();
   }



}
