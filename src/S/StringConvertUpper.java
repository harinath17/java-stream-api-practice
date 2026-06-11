package S;
import java.util.*;
import java.util.List.*;
import java.util.stream.*;

public class StringConvertUpper {
	public static void main(String [] args)
	{
		List<String> toupper= Arrays.asList("hari","rahul","ganesh");
		toupper.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
