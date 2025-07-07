package javafundamentals;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	if(args.length!=2) {
		System.out.println("please enter exactly two arguments: <companyName> <Location>");
		return;
	}
	String company=args[0];
	String location=args[1];
	System.out.print(company + " Technologies " + location);

	}

}
