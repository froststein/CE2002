package Lab4.Shapes;

public class Cuboid extends Rectangle {
	
	public double getArea() {
		return (super.getArea()*4 + (this.getBreath() * this.getBreath() * 2));
	}
}
