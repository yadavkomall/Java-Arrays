import java.util.Scanner;
class sumOfTwo{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length1 : ");
        int len1 = sc.nextInt();
        int a[] = new int[len1];
        System.out.print("Enter Array length2 : ");
        int len2 = sc.nextInt();
        int b[] = new int[len2];
        System.out.print("Enter Array1 : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Array2 : ");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int l = len1 > len2 ? len1 : len2;
        int c[] = new int[l];
        for (int i = 0; i < c.length; i++) {
            if (i < len1 && i < len2) {
                c[i] = a[i] + b[i];
            } else if (i >= len1) {
                c[i] = b[i];
            } else if (i >= len2) {
                c[i] = a[i];
            }
        }
        System.out.print("Sum array : ");
        for (int i : c) {
            System.out.print(i + " ");
        }System.out.println();
}
}