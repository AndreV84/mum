public class isPerfectSquare{
public static void main( String[] args) {
int arg1 =Integer.parseInt(args[0]);
int test = isPerfectSquare(arg1);
System.out.println(test);
}
public static int isPerfectSquare(int n){
if (n<0) return 1;
if (n==1) return 0;
int output = (int) Math.pow(Math.ceil(Math.sqrt(n)),2);

return output;
}
}
