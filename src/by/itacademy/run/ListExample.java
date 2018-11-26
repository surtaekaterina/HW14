package by.itacademy.run;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 10);
		arrayList.add(3, 30);
		System.out.println(arrayList);

		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
		System.out.println(linkedList);

		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		System.out.println(linkedList);

		ListIterator<Object> listIterator = linkedList.listIterator();

		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");

			listIterator = linkedList.listIterator(linkedList.size());
		}
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
	}

}
