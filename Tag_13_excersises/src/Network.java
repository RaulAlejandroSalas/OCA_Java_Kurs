
public class Network {
	public Network(int x, Network n) {
		id = x;
		p = this;
		if(n!=null) {
			p = n;
		}
	}
	
	@Override
	public String toString() {
		return "Id: " + id + "{Network Object}: " + p.id;
	}
	
	int id;
	Network p;

	void go(Network n1) {
		Network n2 = new Network(2, null);
		Network n3 = new Network(3, null);
		System.out.println(n2);
		System.out.println(n3.p.p.id);
	}
	public static void main(String[] args) {
		Network n1 = new Network(1, null);
		n1.go(n1);
		System.out.println();
	}
}
