import java.util.Scanner;
class kthMaxMin{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Given Array : ");
int a[] = new int[] {9,7,6,4,12,56,8,16,32,2,45,67,89};
for(int i:a){
System.out.print(i+" ");
}System.out.println();
System.out.print("Enter value of k to find kth largest and smallest element :  ");
int k = sc.nextInt();
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]<a[j]){
a[i]=a[i]^a[j];
a[j]=a[i]^a[j];
a[i]=a[i]^a[j];
}
}
if(i==k-1){
    System.out.println(k+"th maximum element is "+a[i]); 
}
else if(i==a.length-k){
System.out.println(k+"th min element is "+a[i]);
}
}

}
}