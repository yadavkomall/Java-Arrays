import java.util.Scanner;
class bubbleSort{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of array : ");
int l = sc.nextInt();
System.out.print("Enter array : ");
int a[] = new int [l];
for(int i=0; i<l;i++){
a[i] = sc.nextInt();
}
for(int i=0; i<l-1;i++){
  boolean isSort = true;  
for(int j=0; j<l-1-i;j++)
{ 
if(a[j]>a[j+1]){
a[j]=a[j]^a[j+1];
a[j+1]=a[j]^a[j+1];
a[j]=a[j]^a[j+1];
isSort = false;
}
}
if(isSort){
break;
}
}
System.out.print("Sorted Array : ");
for(int i :a){
System.out.print(i+" ");
}
System.out.println();
}
}