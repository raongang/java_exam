package designPattern.composite;

//하위 Leaf ( 하위노드 가질 수 없음 ) 
public class Leaf extends Component{
	public Leaf(String componentName){
		super(componentName);
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
}
