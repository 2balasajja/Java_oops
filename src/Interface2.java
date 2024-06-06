public class Interface2 implements Interface1 {

    public static void main(String[] args)
    {
        Interface2 int2 = new Interface2();
        int2.display();
        System.out.println(int2.x);
    }
    @Override
    public void display() {
System.out.println("Class implements Interface Test");
    }
}
