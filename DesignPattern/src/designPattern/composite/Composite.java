package designPattern.composite;

//하위 Composite ( 하위 노드 가질 수 있음 ) 
public class Composite extends Component{
	public Composite(String componentName){
		super(componentName);
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}
}
