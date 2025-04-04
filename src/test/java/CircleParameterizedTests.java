import com.example.Circle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CircleParameterizedTests {

    private final double radius;
    private final double expectedOne;
    private final double expectedTwo;

    public CircleParameterizedTests(double radius, double expectedOne, double expectedTwo){
        this.radius = radius;
        this.expectedOne = expectedOne;
        this.expectedTwo = expectedTwo;
    }

    @Parameterized.Parameters
    public static Object[][] parameters(){
        return new Object[][]{
                {2, 12.56, 12.56},
                {5, 78.5, 31.4},
                {9, 254.34, 56.52},
                {15, 706.5, 94.2},
        };
    }

    @Test
    public void ariaCircleTest(){
        Circle circle = new Circle(radius);
        Assert.assertEquals(expectedOne, circle.areaCircle(), 0.5);
    }

    @Test
    public void ariaPerimeterTest(){
        Circle circle = new Circle(radius);
        Assert.assertEquals(expectedTwo, circle.perimeterCircle(), 0.5);
    }
}
