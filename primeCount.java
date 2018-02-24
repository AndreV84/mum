public class primeCount{
public static void main( String [] args) {
int arg1=Integer.parseInt(args[0]);
int arg2=Integer.parseInt(args[1]);
int test = primeCount(arg1,arg2 );
System.out.println(test);
}
public static int primeCount(int start, int end){
int out=0;
for (int i=start; i< end; i++) {
if  (i>1){ 
boolean isPrime= true;
for (int n=2; n<=i-1 ; n++)
{ if ( i%n ==0){ isPrime=false;
break;
}
}
if (isPrime) { out++;}
}}
return out;

}}

