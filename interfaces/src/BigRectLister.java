import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BigRectLister {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 4));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(4, 1));
        rectangles.add(new Rectangle(5, 5));
        rectangles.add(new Rectangle(6, 6));
        rectangles.add(new Rectangle(7, 7));
        rectangles.add(new Rectangle(8, 8));
        rectangles.add(new Rectangle(9, 9));
        rectangles.add(new Rectangle(10, 10));


        Filter bigRectangleFilter = new BigRectangleFilter();
        List<Rectangle> bigRectangles = CollectUtils.collectAll(rectangles.toArray(new Rectangle[0]), bigRectangleFilter);

        for (Rectangle rect : bigRectangles) {
            System.out.println("Rectangle with big perimeter: " + rect.toString());
        }
    }
}
