package default;
import java.util.*;


public class ForEachWithLambda {

	public static void main(String[] args) {
		List<Integer>num=Arrays.asList(2,3,4,5,6,7);
		
		num.forEach(n ->System.out.println(n));

	}

}
