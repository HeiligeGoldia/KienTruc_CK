package Employee;

public class BussinessTripDecoration extends EmployeeDecorator {
    public BussinessTripDecoration(Employee employee) {
        super(employee);
    }
    @Override
    public double calSalary(){
        return super.calSalary() + 5;
    }
}
