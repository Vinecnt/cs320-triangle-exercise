package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

    @Test
    public void test_triangle() {
        

        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
        
        

        actual = Triangle.classify(100, 100, 100);
        expected = EQUILATERAL;
        assertEquals(actual, expected);

        actual = Triangle.classify(150, 150, 150);
        expected = EQUILATERAL;
        assertEquals(actual, expected);
        
        actual = Triangle.classify(20, 30, 40);
        expected = SCALENE;
        assertEquals(actual, expected);
        
        actual = Triangle.classify(40, 30, 20);
        expected = SCALENE;
        assertEquals(actual, expected);
        
        actual = Triangle.classify(20, 40, 30);
        expected = SCALENE;
        assertEquals(actual, expected);
        
        actual = Triangle.classify(5, 5, 2);
        expected = ISOSCELES;
        assertEquals(actual, expected);
        
        actual = Triangle.classify(5, 2, 5);
        expected = ISOSCELES;
        assertEquals(actual, expected);
        
        actual = Triangle.classify(2, 5, 5);
        expected = ISOSCELES;
        assertEquals(actual, expected);
        
        actual = Triangle.classify(-1, -2, -2);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(1, -2, -2);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(1, 2, -2);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(1, 1, 3);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(2, 2, 4);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(-1, -2, -2);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(2, 5, 2);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(6, 2, 2);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(1, 2, 3);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(1, 3, 2);
        expected = INVALID;
        assertEquals(actual, expected);

        actual = Triangle.classify(3, 2, 1);
        expected = INVALID;
        assertEquals(actual, expected);

        Triangle abc = new Triangle();
        assertEquals(abc,new Triangle());
    }
    
   
}
