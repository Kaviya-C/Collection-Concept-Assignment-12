package collectionframework;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class UserMainCode{
	public static String sizeOfResultHashMap(HashMap<Integer,String>hashmap)
	{
		int max=0;
		String empty="";
		Iterator<Integer> iterator=hashmap.keySet().iterator();
		while(iterator.hasNext())
		{	
			int a=iterator.next();
			if(a>max)
			{
				max=a;
				String result=hashmap.get(a);
				empty=result;
			}
		}
		return empty;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		HashMap<Integer,String>hashmap=new HashMap<Integer,String>();
		for(int index=0;index<number;index++)
		{
			hashmap.put(input.nextInt(), input.next());
		}
		System.out.println(UserMainCode.sizeOfResultHashMap(hashmap));
		input.close();
	}
}

