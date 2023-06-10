import java.util.Scanner;
class subSet{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length : ");
        int len1 = sc.nextInt();
        int a[] = new int[len1];
        System.out.print("Enter Array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
         System.out.println("No of possible sets : ");
        int max = (int) Math.pow(2, a.length);
        for (int i = 0; i < max; i++) {
            int temp = i;
            String set = "";
            for (int j = 0; j < a.length; j++) {
                int bin = temp % 2;
                temp = temp / 2;

                if (bin == 0) {
                    set =set+"_\t" ;
                }
                else {
                    set = set+a[j]+"\t";
                }
            }   
           
System.out.println(set);
}
}
}