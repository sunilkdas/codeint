
import java.util.function.Predicate;

public class Helper {
public static  Predicate<Integer> noGt2= new Predicate<Integer>() {
	public  boolean test(Integer i) {
		return i>2? true:false;
	}
};
}
