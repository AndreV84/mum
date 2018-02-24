public class ispfs {
public static void main(String[] args) {

double y =Integer.parseInt(args[0]);
if (y<0) System.out.println("0->1");
else
System.out.println("roundsqrt(y) = " + Math.pow(Math.ceil(Math.sqrt(y)),2) ); 
}
}
