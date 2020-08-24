package InterviwS;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersExp1 {
	static void charcountNum(String inputString) {
		HashMap<Character,Integer>Charcount=new HashMap<Character,Integer>();
		char[] strCount=inputString.toCharArray();
		for(char b:strCount)
		{
			if(Charcount.containsKey(b))
			{
				Charcount.put(b, Charcount.get(b)+1);
				 
			}
			else
			{
				Charcount.put(b, 1);
			}
		}
		for(Map.Entry entry:Charcount.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	public static void main(String[]args) {
		String Str="anilanilanilajyothik";
		charcountNum(Str);
		 
	}
	
 
	

}
