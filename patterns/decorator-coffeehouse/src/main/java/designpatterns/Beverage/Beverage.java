package designpatterns.Beverage;

public abstract class Beverage {

	String description = "Unknown Beverage";
	public enum Size { TALL, GRANDE, VENTI };
	public Size size = Size.TALL;

	public String getDescription() {
		return size.toString() + " " + description;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}

	public abstract double cost();
}
