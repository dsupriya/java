import java.util.*;
public class MyClass {
    public static HashMap <String,Integer> result = new  HashMap <String,Integer>();
   public static void main(String[] args) 
    { 
        HashMap<String, String> dataSet = new HashMap<String, String>(); 
        dataSet.put("A", "C"); 
        dataSet.put("B", "C"); 
        dataSet.put("C", "F"); 
        dataSet.put("D", "E"); 
        dataSet.put("E", "F"); 
        dataSet.put("G", "F"); 
        dataSet.put("F", "F"); 
        
  
        solve(dataSet); 
       
       
    }
    public static void solve(HashMap<String, String> dataset)
    {
        HashMap <String, LinkedList<String>> hm = new HashMap  <String, LinkedList<String>>();
        
        for(Map.Entry <String,String>e : dataset.entrySet())
        {
            //System.out.println(e.getValue() +" "+e.getKey());
            String emp = e.getKey();
            String man = e.getValue();
            if(emp.equals(man))
                continue;
            LinkedList <String> temp = hm.get(man);
            if(temp==null)
            {
                temp = new LinkedList<String>();
                hm.put(man,temp);
            }
            temp.add(emp);
            
        }
        System.out.println(hm);
        for(String emp : dataset.keySet())
            getCount(emp,hm);
        System.out.println(result);
        
    }
    public static int getCount(String emp,  HashMap <String, LinkedList<String>> hm)
    {
        if(hm.containsKey(emp)==false)
        {
            result.put(emp,0);
             return 0;
        }
        int count =0;
        if(result.containsKey(emp))
            return result.get(emp);
        else
        {
            LinkedList <String> follow = hm.get(emp);
            Iterator <String>itr = follow.iterator();
            while(itr.hasNext())
            {
                String next = itr.next();
                count = count+getCount(next,hm);
            }
            count = count+follow.size();
            result.put(emp,count);
            
        }
        return count;
            
    }
    
    
}
