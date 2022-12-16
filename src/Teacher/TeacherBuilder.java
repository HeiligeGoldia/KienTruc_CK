package Teacher;

public class TeacherBuilder {

    private int id;
    private String name;
    private String address;
    private String phone;

    public TeacherBuilder id(int id){
        this.id = id;
        return this;
    }

    public TeacherBuilder name(String name){
        this.name = name;
        return this;
    }

    public TeacherBuilder address(String address){
        this.address = address;
        return this;
    }

    public TeacherBuilder phone(String phone){
        this.phone = phone;
        return this;
    }

    public Teacher buid(){
        return new Teacher(id, name, address, phone);
    }
}
