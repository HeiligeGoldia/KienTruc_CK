package Employee;

public class OTDecoration extends EmployeeDecorator {
    public OTDecoration(Employee employee) {
        super(employee);
    }
    @Override
    public double calSalary(){
        return super.calSalary() + 2;
    }
}
