import java.util.Scanner;
class linearSearch{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Given  Array : ");
int a[] = new int [] {34,54,742,7,5,4,10,78,55,21,56};
for(int i:a){
System.out.print(i+" ");
}
System.out.println();
System.out.print("Enter element to search  : ");
int n = sc.nextInt();
int temp=0;
for(int i=0; i<a.length;i++){
if(a[i]==n){
System.out.println("Element found at index "+i);
temp++;
}
}
if(temp == 0){
System.out.println("Element not found");
}
}
}