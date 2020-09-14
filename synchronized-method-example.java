import java.util.*;
class Line
{
    synchronized public void getLine()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Train extends Thread
{
    Line line; 
  
    Train(Line line) 
    { 
        this.line = line; 
    } 
    public void run()
    {
        line.getLine();
    }
}
public class MyClass {
    public static void main(String args[]) {
      Line line = new Line();
      Train ob = new Train(line);
      Train ob1 = new Train(line);
      ob.start();
      ob1.start();
      
    }
}
