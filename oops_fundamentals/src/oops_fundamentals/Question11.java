package oops_fundamentals;

class StringCombine{
		public static String shortLongshort(String a,String b) {
			if(a.length()==0||b.length()==0) {
				return "";
				
			}else {
				return a.concat(b).concat(a);
			}
		}
	}
public class Question11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StringCombine.shortLongshort("hi", "hello"));

	}

}