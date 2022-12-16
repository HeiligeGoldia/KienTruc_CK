package Teacher;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new TeacherBuilder()
                .id(1)
                .name("Duy")
                .address("123 Nguyen Van Bao")
                .phone("0839002829")
                .buid();
        System.out.println(teacher);
    }

}
