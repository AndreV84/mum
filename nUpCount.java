public class nUpCount{
public static void main(String  args[]){
int [] a= {2 ,3 ,1, -6 ,8, -3, -1, 2};

System.out.println(nUpCount(a,5));

}

public static int nUpCount(int[] a, int n){
int pre=0;
int number=0;

for (int i=0; i<a.length; i++) 
{

if (pre<n && (pre+a[i]>=n)) number++;
pre=pre+a[i];
}
return number;
}
}
