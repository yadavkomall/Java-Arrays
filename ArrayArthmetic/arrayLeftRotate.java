import java.util.Scanner;
class arrayLeftRotate{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int len1 = sc.nextInt();
        int a[] = new int[len1];


        System.out.print("Enter Array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter value of k : ");
        int k = sc.nextInt();
       
        
       if(k>a.length){
        
        k=k%a.length;
        }
        else if(k<0)
        {
            while(k<0){
        k=k+a.length;
            }
        } 
         int split=k;
       
        
        int rotate []= new int [a.length];
        int i=0;
        while(split<a.length){
           rotate[i]=a[split];
           i++;
           split ++;
       }
       split=0;
       
       while(split<k){
       rotate[i]=a[split];
       i++;
       split++;
       }
       System.out.print("Rotated Array : ");
       for(int val:rotate){
       System.out.print(val+" ");
       }System.out.println();
}
}