import java.util.*;
public class Runner Comparator<>
{
    public static void main(String []args)
    {
        TreeSet <Employee>  = new TreeSet<Employee>(new Employee());
        ts.add(new Employee("Z",10));
        ts.add(new Employee("A",10));
        for(Employee e : ts)
            System.out.println(e.name+" "+e.sal+"\n");
        
        
    }
}
class Employee implements Comparator<Employee>
{
    String name;
    Integer sal;
    Employee()
    {
        
    }
    Employee(String name, int sal)
    {
        this.name = name;
        this.sal = sal;
    }
     public int compare(Employee one,Employee two)
    {
        if(one.sal!=two.sal)
            return two.sal.compareTo(one.sal);
        else 
            return two.name.compareTo(one.name);
    }
    
    
}

