package assignment1;
import java.util.*;
class Triangle {
	 
	 double Area(double a,double b,double c)
	 {
         double s=(a+b+c)/2;
         double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		 return area;
	 }

	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 Triangle tr=new Triangle();
		 double a=sc.nextDouble();
		 double b=sc.nextDouble();
		 double c=sc.nextDouble();
		 System.out.println(tr.Area(a, b, c));
		
	}

}