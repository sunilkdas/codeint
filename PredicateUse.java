import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUse {
	
public static void main(String[] args) {
	List<Integer> x=Arrays.asList(1,2,3,4,3,4,2,2,2,4,2,2,2,3);
	Predicate<Integer> p=Helper.noGt2;
	x.forEach(item -> {
		System.out.println(p.test(item)==true?item:"");
	});
}
}
