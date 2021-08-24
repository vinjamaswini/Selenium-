package collections;
import java.util.ArrayList;
//import java.util.List;

public class List {
	public static void main(String[] args) {
		ArrayList <Integer>list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//list.remove(0);
		list.contains(10);
		
		System.out.println(list.get(2));
		for(Object element:list) {
			System.out.println(element);
		}

		
	}

}
