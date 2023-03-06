package encap;

public class EMP {
	private int id;
	private double salray;
	String name;
	
	public EMP(int id, double salray, String name) {
		super();
		this.id = id;
		this.salray = salray;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalray() {
		return salray;
	}
	public void setSalray(double salray) {
		this.salray = salray;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
