package S;
import java.util.stream.*;
import java.util.*;
public class s16 {
	public static void main(String [] args)
	{
		//Return Default Value if Element Not Present
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		/*Optional<Integer> hig=number.stream()
				.filter(n->n==11)
				.findFirst();
		
				hig.ifPresentOrElse(r->System.out.println("11 is found")
			     ,()->System.out.println("NA"));
		*/
		//find first even number
	Optional<Integer >hh=	number.stream().filter(n->n%2==0)
		.findFirst();
	hh.ifPresentOrElse(r->System.out.println(r),()->System.out.println("na"));
			
		
	}

}
