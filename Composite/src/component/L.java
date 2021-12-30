package component;

public class L extends SubComponent {
	public L(String name, String des) {
		super(name, des);
	}

	@Override
	public void print() {
		System.out.println(
				"--------> " + this.getName() + " des:" + this.getDescription());
	}
}
