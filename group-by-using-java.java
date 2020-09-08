import java.util.*;
public class Runner {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
      LinkedList <Student> q = new LinkedList<Student>();
        q.add(new Student("a",10));
        q.add(new Student("b",60));
        q.add(new Student("c",50));
        q.add(new Student("d",10));
        
    print(q);
    Collections.sort(q, new ScoreComparator().thenComparing(new NameComparator() ));
    System.out.println("after sort");
   print(q);
}
public static void print(LinkedList <Student>q)
{
    Iterator <Student>itr = q.iterator();
    while(itr.hasNext())
    {
        Student temp = itr.next();
        
        System.out.println(temp.score+" "+temp.name);
    }
}
}
class Student
{
    String name;
    Integer score;
    Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}
class NameComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}
class ScoreComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s2.score.compareTo(s1.score);
    }
}
