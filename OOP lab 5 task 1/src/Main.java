
class Main
{
    public static void main(String[] args) {
        employeeRepository emp = new employeeRepository();

        employee e1 = new employee("khizar","irfan");
        employee e2 = new employee("zartash","gul");

        emp.addEmployee(e1);
        emp.addEmployee(e2);

        emp.removeEmployee(e2);
        emp.displayEmployees();
    }



}