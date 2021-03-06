package day29iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class I03 {

	public static void main(String[] args) {
		/*
		 Create an integer list
		 Increase all elements by 2
		 Print the "list elements" on the console in reverse order.
		 Print the list on the console in reverse order by using reverse()
		*/
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(12);
		list4.add(13);
		list4.add(14);
		list4.add(15);
		System.out.println(list4);
		
		ListIterator<Integer> it4 = list4.listIterator();
		while(it4.hasNext()) {
			it4.next();
		}
		
		while(it4.hasPrevious()) {
			Integer el = it4.previous();
			it4.set(el = el + 2);
			System.out.print(el + " ");
		}
	
		System.out.println();
		
		Collections.reverse(list4);
		System.out.println(list4);
	}

}
