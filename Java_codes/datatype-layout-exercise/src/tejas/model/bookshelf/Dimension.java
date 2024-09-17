package tejas.model.bookshelf;

public class Dimension{
	
	private double  length;
	private double  width;
	private double  height;
	private String  unit;
	public Dimension(double d, double e, double f,String unit) {
		super();
		this.length = d;
		this.width = e;
		this.height = f;
		this.unit =  unit;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return this.length +"(L)x"+this.width+"(W)x"+this.height+"(H)" + "("+this.unit+")";
	}
	
	
}
