/*Q8. Write a program that show working of different functions of String and StringBufferclasss like 
setCharAt(), setLength(), append(), insert(), concat()and equals(). */

import java.util.*;
class string
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\n\n\nEnter the 1st string :");
		String str1=s.nextLine();
		System.out.print("The 1st string you have entered :");
		System.out.print(str1);
		int len1=str1.length();	//in string we can print a method of string directlywithout effecting its originality like this..
		System.out.print("\nThe lenth of 1st string :");						//System.out.print("\nThe lenth of 1st string :");
		System.out.print(len1);										//System.out.print(str1.length());
		char a=str1.charAt(len1-2);
		System.out.print("\nSecond last word of 1st string :");
		System.out.print(a);
		int ind=str1.indexOf('a');
		System.out.print("\nIndex of occuring first a in 1st string :");
		System.out.print(ind);
		String strs=str1.substring(ind,len1);
		System.out.print("\nThe substring of 1st string :");
		System.out.print(strs);
		String restr=strs.replace('e','o');
		System.out.print("\nAfter replacing e with o from substring :");
		System.out.print(restr);
		String upstr=strs.toUpperCase();
		System.out.print("\nAfter converting in uppercase of substring :");
		System.out.print(upstr);

		System.out.print("\n\n\nEnter the 2nd string :");
		String str2=s.nextLine();
		int len2=str2.length();
		System.out.print("The 2nd string you have entered :");
		System.out.print(str2);
		String str3=str1.concat(str2);
		System.out.print("\nAfter concatinating of both strings :");
		System.out.print(str3);
		boolean f=str1.equals(str2);
		System.out.print("\nEquality status of both string :");
		System.out.print(f);

		System.out.print("\n\n\nEnter the stringbuffer :");
		StringBuffer buf=new StringBuffer();							//in stringbuffer you must create  an object of this 
		buf.append(s.nextLine());									//we can not take input astringbuffer like string
		System.out.print("The stringbuffer you have entered :");
		System.out.print(buf);
		int cap=buf.capacity();			//unlike string methods calling stringbuffer changes its original string after invoking its methods
		System.out.print("\nThe capacity of  stringbuffer :");
		System.out.print(cap);
		int lenbuf=buf.length();
		System.out.print("\nThe length of  stringbuffer :");
		System.out.print(lenbuf);
		buf.append(str2);
		System.out.print("\nAfter appending str2 in stringbuffer :");
		System.out.print(buf);
		buf.insert(lenbuf+len2," thanks");
		System.out.print("\nAfter inserting thanks in stringbuffer :");
		System.out.print(buf);
		buf.setCharAt(buf.length()-1,'!');  					//we can not create another stringbuffer for assigning the modified
		System.out.print("\nAfter setting a character in stringbuffer :");	//value of given stringbuffer without creating an object
		System.out.print(buf);
		buf.setLength(5);
		System.out.print("\nAfter modifying the length of  stringbuffer :");
		System.out.print(buf+"\n\n\n");	
	}
}
