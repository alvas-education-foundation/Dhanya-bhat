package dhanya;
	import java.util.Scanner;
	public class IndividualCharacters  
	{  
	    public static void main(String[] args) { 
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter a string");
	        String str=s.nextLine();  
	  
	        System.out.println("Individual characters from given string: ");  
	  
	        //Iterate through the string and display individual character  
	        for(int i = 0; i < str.length(); i++){  
	            System.out.print(str.charAt(i) + " ");  
	        }  
	    }  
	}

