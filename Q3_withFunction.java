package day8;
//Write a Java program to return the sum of the digits present in the given string. 
	//If there is no digits the sum return is 0.
	
public class Q3_withFunction {
 
		 
 static int  sumofdigit(String a)
	{
		 
        int len=a.length(); //5
        int sum=0;
        
        for(int i=0;i<len;i++)  
        {
        	//isDigit is a function of character class which will return true/false
        	//if(Character.isDigit(a.charAt(i)))
        	if(a.charAt(i)>=48 && a.charAt(i)<57)  //0-9 ascii 
        			{
        		    String e= a.substring(i,i+1);
        		    sum = sum + Integer.parseInt(e);
        		    }
        }
       return sum;
	}
		public static void main(String[] args)
		{  
			int y= sumofdigit("hello12345");
			System.out.println(y);
			
			  
			
		}

	}
