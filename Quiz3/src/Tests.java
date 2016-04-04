import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	Triangle tri1= new Triangle(3,4,5);
	Triangle tri2= new Triangle(5,5,5);
	Triangle tri3= new Triangle(10,10,15);
	Triangle tri4= new Triangle(10, 7, 5);

	@Test
	public void areaTest() {
		assertEquals(tri1.getArea(),6.0, 0);

		assertEquals(tri2.getArea(), 10.8, 0.1);

		assertEquals(tri3.getArea(), 49.6, 0.1);

		assertEquals(tri4.getArea(), 16.2, 0.1);
	}
	
	@Test
	public void perimeterTest(){
		assertEquals(tri1.getPerimeter(), 12, 0);
		assertEquals(tri2.getPerimeter(), 15, 0);
		assertEquals(tri3.getPerimeter(), 35, 0);
		assertEquals(tri4.getPerimeter(), 22, 0);
	}
}
