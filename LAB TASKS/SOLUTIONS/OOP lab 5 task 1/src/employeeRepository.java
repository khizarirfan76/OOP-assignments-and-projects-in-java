import java.util.*;
public class employeeRepository
{
    HashSet<employee> employeesSet= new HashSet<>();

    public void addEmployee(employee employee)
    {
        employeesSet.add(employee);
    }

    public void removeEmployee(employee employee)
    {
        employeesSet.remove(employee);
    }

    public void displayEmployees()
    {
        for(employee e : employeesSet)
        {
            System.out.println(e);
        }
    }



}
