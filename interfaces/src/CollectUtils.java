import java.util.ArrayList;
import java.util.List;

public class CollectUtils {
    public static <T> List<T> collectAll(T[] objects, Filter filter) {
        List<T> result = new ArrayList<>();
        for (T obj : objects) {
            if (filter.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }
}
