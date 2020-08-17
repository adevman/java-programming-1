package assignment1;
import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception 
{ 
    public MyException(InputMismatchException e) 
    { 

        System.out.println("Only number can be entered");
    } 
} 

class javaQues {
	
	float cal(float n) 
	{
		return (float) (2*n/3);
	}
	
	public static void main(String[] args) throws MyException {
		javaQues n=new javaQues();
		Scanner sc=new Scanner(System.in);
		float num=0.0f;
		
		try
		{
		    num=sc.nextFloat();
		    
		}
	
		catch(InputMismatchException e)
		{
			throw new MyException(e);
		}
		System.out.println(n.cal(num));
	}

}