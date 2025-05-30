import com.example.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TriangleParameterizedTests {

    private final double a;
    private final double b;
    private final double c;
    private final double h;
    private final float angle;
    private final double expectedOne;
    private final double expectedTwo;
    private final double expectedThree;
    private final double expectedFour;

    public TriangleParameterizedTests(double a, double b, double c, double h, float angle, double expectedOne, double expectedTwo, double expectedThree, double expectedFour){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        this.angle = angle;
        this.expectedOne = expectedOne;
        this.expectedTwo = expectedTwo;
        this.expectedThree = expectedThree;
        this.expectedFour = expectedFour;
    }

    @Parameterized.Parameters
    public static Object[][] parameters(){
        return new Object[][]{
                {5, 7, 8, 6, 45, 20, 14.8, 216.33, 24},
                {9, 12, 10, 8, 60, 31, -16.45, 521.64, 40},
                {3, 4, 5, 2.5, 30, 12, -5.92, 77.76, 6.25},
                {8, 10, 12, 9, 75, 30, -15.51, 487.44, 54},
        };
    }

    @Test
    public void perimeterTriangleTest(){
        Triangle.setA(a);
        Triangle.setB(b);
        Triangle.setC(c);
        Assert.assertEquals(expectedOne, Triangle.perimeterTriangle(), 0.1);
    }

    @Test
    public void ariaThreeSideTriangleTest(){
        Triangle.setA(a);
        Triangle.setB(b);
        Triangle.setC(c);
        Assert.assertEquals(expectedThree, Triangle.areaThreeSideTriangle(), 0.1);
    }

    @Test
    public void ariaTwoSideAngleTriangleTest(){
        Triangle.setA(a);
        Triangle.setB(b);
        Triangle.setAngle(angle);
        Assert.assertEquals(expectedTwo, Triangle.areaTwoSideAngleTriangle(), 0.1);
    }

    @Test
    public void ariaBaseHeightTriangleTest(){
        Triangle.setC(c);
        Triangle.setH(h);
        Assert.assertEquals(expectedFour, Triangle.areaBaseHeightTriangle(), 0.1);
    }
}
