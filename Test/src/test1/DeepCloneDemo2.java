package test1;

public class DeepCloneDemo2 {

	public static void main(String[] args) {

		Vidio v1 = new Vidio();
		v1.setName("PHP");

		Author author = new Author();
		author.setName("Lee");
		v1.setAuthor(author);

		ID id = new ID();
		id.setNumber("RRVV");
		author.setId(id);

		Vidio v2 = DeepClone.deepClone(v1);

		System.out.println(v1);
		System.out.println(v2);

	}

}
