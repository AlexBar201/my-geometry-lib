import com.example.Rectangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RectangleParameterizedTests {

    private final double length;
    private final double width;

    public RectangleParameterizedTests(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Parameterized.Parameters
    public static Object[][] parameters(){
        return new Object[][]{
                {2.1, 4.1},
                {2, 4},
                {10, 58},
                {100, 150},
        };
    }

    @Test
    public void ariaRectangleTest(){
        double expected = length * width;
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(expected, rectangle.areaRectangle(), 0.01);
    }

    @Test
    public void perimeterRectangleTest(){
        double expected = (length + width) * 2;
        Rectangle rectangle = new Rectangle(length, width);
        Assert.assertEquals(expected, rectangle.perimeterRectangle(), 0.01);
    }
}
