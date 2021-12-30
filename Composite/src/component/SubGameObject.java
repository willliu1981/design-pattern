package component;

import java.util.ArrayList;
import java.util.List;

public class SubGameObject extends Component {

	private List<Component> components = new ArrayList<>();

	public SubGameObject(String name, String des) {
		super(name, des);
	}

	@Override
	public void add(Component comp) {
		components.add(comp);
	}

	@Override
	public void remove(Component comp) {
		components.remove(comp);
	}

	@Override
	public void print() {
		System.out.println(
				"####===================" + getName() + "======================");
		System.out.println("description:" + this.getDescription());
		components.forEach(x -> {
			x.print();
		});
	}

}
