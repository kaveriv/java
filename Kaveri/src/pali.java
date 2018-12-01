import java.util.Scanner;

public class pali {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the string");
	String s1=scan.nextLine();
	
	String temp="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		 temp+=s1.charAt(i);
	}
	
	
	if(s1.equals(temp))	{
		System.out.println(" palindrome");
		
	}
	else
	{
		System.out.println("not palindrome");
		
	}
	
	}
}
