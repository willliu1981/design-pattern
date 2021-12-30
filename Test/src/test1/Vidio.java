package test1;

import java.io.Serializable;

public class Vidio implements Serializable {
	private String name;
	private Author author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String toString() {

		return String.format(
				"vidio name: %s ,author name:%s ,author hashcode:%s ,author id:%s ,"
						+ "author id hashcode:%s",
				this.getName(), this.getAuthor().getName(),
				this.getAuthor().hashCode(),
				this.getAuthor().getId().getNumber(),
				this.getAuthor().getId().hashCode());
	}
}
