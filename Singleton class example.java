public class MyClass {
    public static void main(String args[]) {
      Singleton ob = Singleton.getInstance();
      System.out.println(ob.hashCode());
      Singleton ob1 = Singleton.getInstance();
      System.out.println(ob1.hashCode());
    }
}
class Singleton
{
    static Singleton ob = null;
    private Singleton()
    {
        
    }
    public static Singleton getInstance()
    {
        if(ob==null)
            ob = new Singleton();
       return ob;
    }
}
