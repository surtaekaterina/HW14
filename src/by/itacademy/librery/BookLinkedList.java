package by.itacademy.librery;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

import by.itacademy.myExceptions.BoolListNotSupportedOperation;

public class BookLinkedList implements Deque<Book> {

	private LinkedList<Book> books;

	/*public void insertBeforePartocularBook(BookLinkedList bookLinkedList, Book particularBook, Book newBook) {
		for (Book book : bookLinkedList) {
			if (book.equals(particularBook)) {
				bookLinkedList.add(newBook);
			}
		}
	}*/

	public Book findBookByTitle(String bookTitle) {
		Book resultBook = new Book();
		for (Book book : books) {
			if (book.getTitle().equals(bookTitle)) {
				resultBook = book;
			}

		}
		return resultBook;
	}

	public void sortByCountOfLists() {
		System.out.println(books);
		Comparator<Book> comparator = new Comparator<Book>() {
			public int compare(Book one, Book two) {
				return Integer.compare(two.getCountOfLists(), one.getCountOfLists());

			}
		};

		Collections.sort(books, comparator);
		System.out.println(books);

	}

	public BookLinkedList(LinkedList<Book> books) {
		super();
		this.books = books;
	}

	@Override
	public boolean addAll(Collection<? extends Book> c) {
		throw new BoolListNotSupportedOperation();
		// return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new BoolListNotSupportedOperation();
		// return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Book e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addFirst(Book e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLast(Book e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Book> descendingIterator() {
		throw new BoolListNotSupportedOperation();
		// return null;
	}

	@Override
	public Book element() {
		throw new BoolListNotSupportedOperation();
		// return null;
	}

	@Override
	public Book getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Book> iterator() {
		throw new BoolListNotSupportedOperation();
		// return null;
	}

	@Override
	public boolean offer(Book e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerFirst(Book e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean offerLast(Book e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book peekFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Book e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
