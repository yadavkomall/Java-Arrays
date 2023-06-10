import java.util.Scanner;
class selectionSort {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Array length : ");
int l = sc.nextInt();
System.out.print("Enter Array : ");
int a[] = new int [l];
for(int i=0; i<l;i++){
a[i]= sc.nextInt();
}
for(int i=0; i<l;i++){
  int smallest =i;  
for(int j=i+1; j<l;j++){
if(a[smallest]>a[j]){
smallest = j;
}
}
int temp = a[i];
a[i]=a[smallest];
a[smallest]= temp;


}
System.out.print("Sorted Array : ");
for(int i:a){
System.out.print(i+" ");
}
System.out.println();
}
}