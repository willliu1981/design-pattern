package main;

public class DeepCloneDemo {

	public static void main(String[] args) {

		Book b1 = new Book();
		b1.setName("Java");

		Author author = new Author();
		author.setName("Wu");
		b1.setAuthor(author);

		ID id = new ID();
		id.setNumber("AABB");
		author.setId(id);

		Book b2 = (Book) b1.deepClone();

		System.out.println(b1);
		System.out.println(b2);

	}

}
