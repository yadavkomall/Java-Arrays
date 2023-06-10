import java.util.*;
class buy_sellStock{
public static int stocks(int a[]){
int byprice=Integer.MAX_VALUE;
int maxprofit=0;
for(int i=0;i<a.length;i++){
if(byprice<a[i]){
int profit=a[i]-byprice;
maxprofit=Math.max(maxprofit,profit);
}
else{
byprice=a[i];
}
}
return maxprofit;
}  

public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter no. of days : ");
int n= sc.nextInt();
int price[]= new int [n];
System.out.print("Enter prices : ");
for(int i=0;i<n;i++){
price[i]=sc.nextInt();

}
int mp = stocks(price);
System.out.println("Maximum profit : "+mp);
}
}