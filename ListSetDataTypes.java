package collectionframework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ListSetDataTypes {
	public static void main(String[] a) {
		String word="Kaviya";
		ArrayList<Integer> integerList=new ArrayList<Integer>();
		Collections.addAll(integerList, 96,97,98,99,100);
		System.out.println("Integer list: "+integerList.toString());
		
		ArrayList<Float> floatList=new ArrayList<Float>();
		Collections.addAll(floatList, 96.09f,97.8f,98.00f,99.89f,100.0f);
		System.out.println("Float list: "+floatList.toString());
		
		ArrayList<Double> doubleList=new ArrayList<Double>();
		Collections.addAll(doubleList, 9.6,97.7,9.0,9.9,1.0);
		System.out.println("Double list: "+doubleList.toString());
		
		ArrayList<Short> shortList=new ArrayList<Short>();
		shortList.add((short) 7);
		shortList.add((short) 70);
		shortList.add((short) 140);
		shortList.add((short) 210);
		System.out.println("Short list: "+shortList.toString());
		
		HashSet<String>name=new HashSet<String>();
		name.add("Kaviya");
		name.add("Samyutha");
		name.add("Dilip");
		System.out.println("String List "+name);
		
		ArrayList<Character>charList=new ArrayList<Character>();
		for(char letter:word.toCharArray()) 
		{
			charList.add(letter);
		}
		System.out.println("Character List: "+charList);
		
		
		ArrayList<Boolean> booleanList=new ArrayList<Boolean>();
		booleanList.add(true);
		booleanList.add(false);
		System.out.println("Boolean list : "+booleanList);
		
		ArrayList<Byte> byteList=new ArrayList<Byte>();
		byteList.add((byte) 89);
		byteList.add((byte) 6);
		System.out.println("Byte list : "+byteList);


		}
	}


