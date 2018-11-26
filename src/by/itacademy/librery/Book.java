package by.itacademy.librery;

public class Book {

	private String autor;
	private String title;
	private Integer countOfLists;

	
	public Book() {
		
	}
	public Book(String autor, String title, int countOfLists) {
		super();
		this.autor = autor;
		this.title = title;
		this.countOfLists = countOfLists;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCountOfLists() {
		return countOfLists;
	}

	public void setCountOfLists(int countOfLists) {
		this.countOfLists = countOfLists;
	}

	@Override
	public String toString() {
		return "Book [autor=" + autor + ", title=" + title + ", countOfLists=" + countOfLists + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + countOfLists;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (countOfLists != other.countOfLists)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
