package collectionframework;

import java.util.LinkedHashSet; 
import java.util.Scanner;
public class ArrangeVowels 
{
	public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the String:");
			String word=input.next();
			String result=word.replaceAll("[^aeiouAEIOUZ]", "");
			LinkedHashSet<Character> linked=new LinkedHashSet<Character>();
			for(int i=0;i<result.length();i++)
			{ 
				linked.add(result.charAt(i));
			}
			if(linked.size()==5) 
			{
				System.out.println("Valid");
			}else
			{
				System.out.println("InValid");
			}
		}
	}

