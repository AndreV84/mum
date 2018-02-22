public class Fibonacci {
public static void main (String[] args){
int n = Integer.parseInt(args[0]);
System.out.println("you entered :" + n);
int a = (int) Math.round(Math.pow(5*n*n+4, 1.0/2.0));
int x= 5*n*n+4;
int y= 5*n*n-4;
//if (x ==  a * a) System.out.println("f number");
int  b = (int) Math.round(Math.pow(5*n*n-4, 1.0/2.0));
//if (y ==  a * a) System.out.println("f number"); 
if (x ==  a * a || y ==  b * b) System.out.println( n +" is a Fibonachi number"); 
else  System.out.println( " it is not a Fibonachi number");
}
}
