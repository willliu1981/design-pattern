package component;

import java.util.ArrayList;
import java.util.List;

public class LeafGameObject extends Component {


	public LeafGameObject(String name, String des) {
		super(name, des);
	}

	@Override
	public void print() {
		System.out.println(
				"===> " + this.getName() + " des:" + this.getDescription());
	}
}
