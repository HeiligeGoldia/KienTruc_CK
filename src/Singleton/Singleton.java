package Singleton;

public class Singleton {

    private static Singleton instance;
    private String msg;

    private Singleton() {
        this.msg = "Duy";
    }

    public synchronized static Singleton getInstance() {
        return instance == null ? new Singleton() : instance;
    }

    public void sayHi() {
        System.out.println("Say hi, " + msg);
    }

}
