package oops_fundamentals;
import java.util.*;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1=new StringJoiner("-");
		s1.add("H");
		s1.add("B");
		System.out.println(s1);
		StringJoiner s2=new StringJoiner("-");
		s2.add("T");
		s2.add("p");
		StringJoiner r=new StringJoiner("-");
		r.merge(s1);
		r.merge(s2);
		System.out.println("s1 merged to s2: "+r);
		StringJoiner r2=new StringJoiner("-");
		r2.merge(s2);
		r2.merge(s1);
		System.out.println("s2 merged to s1: "+r2);
		
	}

}