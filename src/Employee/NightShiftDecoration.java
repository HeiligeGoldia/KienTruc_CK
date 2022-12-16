package Employee;

public class NightShiftDecoration extends EmployeeDecorator {
    public NightShiftDecoration(Employee employee) {
        super(employee);
    }
    @Override
    public double calSalary(){
        return super.calSalary() + 3;
    }
}
