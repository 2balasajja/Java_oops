public interface Interface3 extends Interface1 {
    public static void main(String[] args)
    {
        Interface3 int3 = new Interface3() {
            @Override
            public void display() {
                System.out.println("interface extends interface");
            }
        };
        int3.display();
       System.out.println(int3.x);
    }

}
