
class CIRCLE2D {
	private double x; 
	private double y; 
	private double radius;

	
	public CIRCLE2D() {
		this(0, 0, 1);
	}

	public CIRCLE2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	
	public double getRadius() {
		return radius;
	}

	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}


	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 <= this.radius;
		
	}


	public boolean contains(CIRCLE2D circle) {
		return (Math.sqrt(Math.pow(x - circle.getX() , 2) + 
				 Math.pow(y - circle.getY(), 2)) + circle.getRadius())
				 <=(this.radius);
	}
	public boolean overlaps(CIRCLE2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= this.radius + circle.getRadius();
	}
	
}



