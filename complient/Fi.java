public class Fi {
public static void main (String[] args){
int n = Integer.parseInt(args[0]);
int test= isFibonacci(n);
System.out.println(test);
}
public static int isFibonacci (int n){
int x= 5*n*n+4;
int y= 5*n*n-4;
int a = (int) Math.round(Math.pow(5*n*n+4, 1.0/2.0));
int b = (int) Math.round(Math.pow(5*n*n-4, 1.0/2.0));
if (x ==  a * a || y ==  a * a)
return(int) (1);
else return (int) (0);
}}


