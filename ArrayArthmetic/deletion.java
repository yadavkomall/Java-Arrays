import java.util.Scanner;
class deletion{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
         int a[] = new int[]{10,20,30,40,50,60};
         System.out.print("Given Array : ");
         for(int i :a){
         System.out.print(i+" ");
         }System.out.println();
         System.out.print("Enter element to delete : ");
         int element = sc.nextInt();
         for(int i=0; i<a.length;i++){
         if(a[i]==element){
         for(int j=i;j<a.length-1;j++){
         a[j]=a[j+1];
         }
         }
         }
         
         System.out.print("Resultant array :");
         for(int i =0;i<a.length-1;i++){
         System.out.print(a[i]+" ");
         }System.out.println();
}
}