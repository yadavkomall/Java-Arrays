import java.util.Scanner;
class SumOfDiagonal{
 public static int Sumdiag(int a[][]){
        int sum=0;
    for(int i=0;i<a.length;i++){
    sum += a[i][i];
    if(i != a.length-1-i){
    sum += a[i][a.length-1-i];
    }
    }
    return sum;
    }
public static void main(String args[]){
       Scanner sc = new Scanner (System.in);
        System.out.print("Enter dimension of square matrix : ");
        int n=sc.nextInt();
       
        System.out.println("Enter Array : ");
        int a[][] = new int [n][n];
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
        }
        }
        
        int s = Sumdiag(a);
        System.out.println("sum of diaginals : "+s);
}
}