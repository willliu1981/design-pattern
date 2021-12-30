package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Book implements Serializable {
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

	public Object deepClone() {

		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;

		try {
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);

			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			Book copyObj = (Book) ois.readObject();

			return copyObj;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public String toString() {

		return String.format(
				"book name: %s ,author name:%s ,author hashcode:%s ,author id:%s ,"
						+ "author id hashcode:%s",
				this.getName(), this.getAuthor().getName(),
				this.getAuthor().hashCode(),
				this.getAuthor().getId().getNumber(),
				this.getAuthor().getId().hashCode());
	}
}
