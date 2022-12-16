package Employee;

public class Main {

    public static void main(String[] args) {
        Employee teacher = new Teacher();
        System.out.println("Teacher base: " + teacher.calSalary());

        Employee teacherOT = new OTDecoration(teacher);
        System.out.println("Teacher OT: " + teacherOT.calSalary());

        Employee officer = new Officer();
        System.out.println("Officer base: " + officer.calSalary());

        Employee officerNS = new NightShiftDecoration(officer);
        System.out.println("Officer night shift: " + officerNS.calSalary());

        Employee officerBS = new BussinessTripDecoration(officer);
        System.out.println("Officer business trip: " + officerBS.calSalary());
    }

}
