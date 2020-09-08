import java.util.*;

public class Runner
{
    public static void main(String []args)
    {
        Student ob = new Student("a",100);
        System.out.println(ob);
        ob = ob.updateMark(90);
        System.out.println(ob);
        
    }
}

/*
to create immutable class
-declare class as final
-declare all varibles as final
-parametrized constuctor
-no setter methods
-getter method for all varibale
*/
final class Student
{
    final String name;
    final Integer mark;
    Student(String name, Integer mark)
    {
        this.name = name;
        this.mark = mark;
    }
    String getName()
    {
        return this.name;
    }
    Integer getMark()
    {
        return this.mark;
    }
    Student updateMark(Integer updated_mark)
    {
        String n = this.name;
        return new Student(n,updated_mark);
    }
}
