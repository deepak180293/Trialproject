package Dummy;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Javaprogram {
	
	private static final int Integer = 0;


	//@Test
	public void ipaddress() throws Throwable
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		int count=0;
		int num=i;
		
		while(i!=0)
		{
			int digit=i%10;
			System.out.println(digit);
		     i=i/10;
		     count++;
		}
			System.out.println(num+"  having a no.of digit  is "+count);
		
		
	}
	//@Test
	public void M2() throws Throwable
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		int diff=0;
		int num=i;
		
		while(i!=0)
		{
			int digit=i%10;
			diff=digit-diff;
		     i=i/10;
		     
		}
			System.out.println(num+"  having a no.of digit  is "+diff);
	

	}
 //@Test

   public void m3()
   {
	   
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int i=sc.nextInt();
		//	ArrayList<Integer> reve=new ArrayList<Integer>();
			int num=i;
			int rev=0;
			while(i!=0)
			{
				int digit=i%10;
		       	rev=rev*10+digit;
			     i=i/10;
			     
			}
				System.out.println(rev);
				if(rev==num)
				{
					System.out.println("Number is palirdrome ");
				}else
				{
					System.out.println("non");
				}
	   
	    }
  // @Test
   public void m4()
   {
	   
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the sentencs");
			String str=sc.nextLine();
			String[] word=str.split(" ");
			boolean flag=true;
			System.out.println("enter a word");
			String str1=sc.nextLine();
			for(String i:word)
			{
				System.out.println(i);
				if(i.equalsIgnoreCase(str1))
				{
				 flag= false;
				 
				}
				if(flag==false)
				{
					System.out.println("we got the word");
					break;
				}
				
		}
	
	   
	    }
 // @Test
   public void M5()
   {
	  
	   String[] a={"rahul","virath"};
	   String[] b={"manish","bro"};
	   List<String> ele=new ArrayList<String>();
	   ele.addAll(Arrays.asList(a));
	   ele.addAll(Arrays.asList(b));
	   System.out.println(ele);
	   
	   
	   
	   
	   
   }

   
//@Test
public void m6()
{
	String str="hello programmer";
	int countchar=str.length();
	HashMap<Character, Integer> count=new HashMap<Character,Integer>();
	
	for(int i=0;i<countchar;i++)
	{
		char ch=str.charAt(i);
		if(count.containsKey(ch))
		{
		  count.put(ch,count.get(ch)+1);
		}
		//System.out.println(count);
		else
		{
			count.put(ch, 1);
		}
	}
	for(Map.Entry<Character,Integer>  entry :count.entrySet())
	{
		if(entry.getValue()>1)
		{
			System.out.println(entry.getKey()+"====>>."+entry.getValue());
		}
	}
}
//@Test
public void strongNUmber()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int num=sc.nextInt();
	int sum=0;
	
	//int count=0;
	int copynum=num;
	
   while(num!=0)
   {
	   int fact=1;
	   int d=num%10;
	   for(int i=1;i<=d;i++)
	   {
		   fact=fact*i;
	   }
	   sum=sum+fact;
	   System.err.println(sum);
	   num=num/10;
   }
   if(sum==copynum)
   {
	   System.out.println("Number is Storng Number");
  }
   else
   {
	   System.err.println("SORRY!! Number is not a strong Number");
	   Reporter.log("failed",true);
   }
	
	
}
	//@Test
	public void ArmstrongNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		 int copynum=num;
		// int pow=1;
		
	     while(num!=0)
	     {
	    	 int digit=num%10;
	    	 count++;
	    	 num=num/10;
	     }
	     num=copynum;
	     while(num!=0)
	     {
	    	 int pow=1;
	    	 int digit=num%10;
	    	 for(int i=1;i<=count;i++)
	    	 {
	    		 pow=pow*digit;
	    	 }
	    	 sum=sum+pow;
	    	 num=num/10;
	     }
	     if(sum==copynum)
	     {
	    	 System.out.println("Number is Armstrong");
	     }else
	     {
	    	 System.err.println("Sorry Number is Not Armstrong");
	     }
	    
		
	}
//	@Test
	public void digitonly()
	{
		String str="deepdk@190sj284";
		String digit="";
		String cha="";
		int len=str.length();
		for(int i=0;i<=len-1;i++)
		{
		   char ch=str.charAt(i);
		   if(Character.isDigit(ch))
		   {
			   digit =digit+ch;
			   
		   }
		   if(Character.isLetter(ch))
		   {
			   cha=cha+ch;
		   }
		 
		   
		}
		System.out.println("letter is "+cha+" and "+digit+"digit ");
	}
	@Test
	public void stringjoiner()
	{
		String[] words = {"apple", "banana", "orange", "peach"};
	     String delimiter=" -";
	     String join=String.join(delimiter, words);
	     System.out.println(join+"   ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
