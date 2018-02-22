public class Main {
public static void main(String[] args) {

int arg1 = Integer.parseInt(args[0]);
int test = nextPerfectSquare(arg1);
System.out.println(test);
}

public static int nextPerfectSquare (int n) {

if (n<0) return 1;

return (int)(Math.pow(Math.ceil(Math.sqrt(n)),2));

}

}
