package component;

public abstract class Component {
	private String name;
	private String description;

	public Component(String name, String des) {
		super();
		this.name = name;
		this.description = des;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void add(Component comp) {
		throw new UnsupportedOperationException();
	}

	public void remove(Component comp) {
		throw new UnsupportedOperationException();
	}

	public abstract void print();

}
