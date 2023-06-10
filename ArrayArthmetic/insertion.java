
import java.util.Scanner;
class insertion {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
         int a[] = new int[]{10,35,64,45,67,89,32};
         System.out.print("Given Array : ");
         for(int i:a){
         System.out.print(i+" ");
         }System.out.println();
         System.out.print("Enter element to insert : ");
         int element = sc.nextInt();
      
         System.out.print("Enter position on which element to be inserted : ");
         int pos = sc.nextInt();
         for(int i=a.length-1;i>pos-1;i--){
         a[i]=a[i-1];
         }
         a[pos-1]=element;
         for(int i:a){
         System.out.print(i+" ");
         }System.out.println();
}
}