package day8;
/*
 * Write a Java program to make a new string from two given string in such a way that, each character of two string will come respectively.
Input
   welcome
   hello
Output
The given strings  are: welcome  and  hello
The new string is: wheellcloome

 */
public class Q4 {

	public static void main(String[] args) {
		 String a="javaworld";
		 String b="123423323";
		 String c="";
		 int alen= a.length();//9
		 int blen=b.length();//4
		 int max= Integer.max(alen,blen);
		 
		 //output j1a2v3a4
		 for(int i=0;i<max;i++)
		 {
			 if(i<alen) 
			     c =  c+ a.charAt(i);
			 if(i<blen)
				 c=c+b.charAt(i);
		 }

		 System.out.println(c);
	}

}
