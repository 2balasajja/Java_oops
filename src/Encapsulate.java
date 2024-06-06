// Java Program to demonstrate
// Java Encapsulation
// Encapsulating the name and age
// only approachable and used using
// methods defined
public class Encapsulate {

private String name;
private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String args[])
{
    Encapsulate e = new Encapsulate();
    e.setName("Gopi");
    e.setAge("40");
    System.out.println(e.getName());
    System.out.println((e.getAge()));

}
}
