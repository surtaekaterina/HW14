package by.itacademy.run;

import by.itacademy.librery.Book;
import by.itacademy.librery.BookLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainLinkedBooks {

	public static void main(String[] args) {

		Book resultBook = new Book();
		LinkedList<Book> tempHomeLibrary = new LinkedList<Book>();

		tempHomeLibrary.add(new Book("Pushkin AA", "Y lukomor'ya", 176));
		tempHomeLibrary.add(new Book("Makkalou Kolin", "V ternovnike", 9986));
		tempHomeLibrary.add(new Book("Unknown", "Tri kota", 66));
		tempHomeLibrary.add(new Book("Unknown", "Shlyapa", 176));
		tempHomeLibrary.add(new Book("Chukovsky", "Mojdodyr", 43));

		BookLinkedList homeLibrary = new BookLinkedList(tempHomeLibrary);

		resultBook = homeLibrary.findBookByTitle("Tri kota");
		System.out.println(resultBook);

		homeLibrary.sortByCountOfLists();

	}

}
