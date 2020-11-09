
public class Exercise10_11 {
	public static void main(String[] args) {
		 CIRCLE2D c1 = new CIRCLE2D(2, 2, 5.5);
	      System.out.println("Area is " + c1.getArea());
	      System.out.println("Perimeter is " + c1.getPerimeter());
	      System.out.println("c1 contains point (3, 3)? " 
	         + c1.contains(3, 3));
	      System.out.println("c1 contains circle Circle2D(4, 5, 10.5)? " 
	         + c1.contains(new CIRCLE2D(4, 5, 10.5)));
	      System.out.println("c1 overlaps circle Circle2D(3, 5, 2.3)? " 
	         + c1.overlaps(new CIRCLE2D(3, 5, 2.3)));
	   }
}
  