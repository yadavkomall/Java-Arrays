import java.util.Scanner;
class insertionSort{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of array : ");
int l = sc.nextInt();
System.out.print("Enter array  : ");
int a[] = new int[l];
for(int i=0; i<l;i++){
a[i]= sc.nextInt();
}
for(int i=1;i<l;i++){
int current= a[i];
int j = i;
while(j>0 && current < a[j-1]){
a[j]=a[j-1];
j--;
}
a[j]= current;
}
System.out.print("Sorted Array : ");
for(int i:a){
System.out.print(i+" ");
}
System.out.println();
}
} 