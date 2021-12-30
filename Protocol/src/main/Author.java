package main;

import java.io.Serializable;

public class Author implements Serializable {
private String name;
private ID id;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ID getId() {
	return id;
}

public void setId(ID id) {
	this.id = id;
}


}
