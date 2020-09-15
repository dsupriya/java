public class ExHashMap
{
	HashMap <Integer,Value> hm;
	PriorityQueue <Entry<Integer,Value>> garbage;
	public long expireLimit;
	ExHashMap(long limit)
	{
		this.hm = new HashMap<Integer,Integer>();
		this.garbage = new PriorityQueue <Entry<Integer,Value>>(Collections.reverseOrder());
		this.expireLimit = limit; 
	}
	public Integer get(Integer k)
	{
		if(hm.containsKey(k))
		{
			Value temp = hm.get(k);
			if(now - temp.createdTime <= expireLimit)
				return temp.key;
			else
			{
				hm.remove(k);
			}
		}
		return null;
	}
	
	public boolean put(Integer k, Integer v) 
	{
		Value v = new Value(v,now);
		hm.put(k,v);
		Entry <Entry<Integer,Value>> e = new Entry(k,v);
	
	}
	void removeStealEntries()
	{
		//remove the top
		//check the createdTime 
		//if(createdTime - now >10)
	
	}

}
 
