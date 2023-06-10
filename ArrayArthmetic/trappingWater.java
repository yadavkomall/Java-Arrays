import java.util.Scanner;

/**
 *
 * tc = o(n)
 * sc= o(n)
 */
class trappingWater{
public static int TrappedWater(int bars[]){
    int n = bars.length;
int leftmax[]=new int [n];
leftmax[0]=bars[0];
for(int i=1;i<n;i++){
leftmax[i]=Math.max(bars[i],leftmax[i-1]);
}

int rightmax[]=new int[n];
rightmax[n-1]=bars[n-1];
for(int i=n-2;i>=0;i--){
rightmax[i]=Math.max(bars[i],rightmax[i+1]);
}
int trapped=0;
for(int i=0;i<n;i++){
int waterLevel= Math.min(leftmax[i],rightmax[i]);
trapped += waterLevel-bars[i];
}
return trapped;
}


public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of bars : "); 
 int n= sc.nextInt();
 System.out.print("Enter height of bars : ");
 int bars[]=new int[n];
 for(int i=0;i<n;i++){
 bars[i]=sc.nextInt();
 }
int result= TrappedWater(bars);
System.out.println("Water trapped between bars : "+result);
}
}