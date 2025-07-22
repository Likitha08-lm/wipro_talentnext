package oops_fundamentals;
import java.util.*;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<>();
		names.add("Likitha");
		names.add("A");
		names.add("B");
		StringJoiner s1=new StringJoiner("," ,"{","}");
		names.forEach(name->s1.add(name));
		System.out.println(s1);

	}

}