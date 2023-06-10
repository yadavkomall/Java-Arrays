import java.util.Scanner;
class spiralMatrix{

 public static void printSpiral(int a[][]) {
        int startrow = 0;
        int endrow = a.length - 1;
        int startcol = 0;
        int endcol = a[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            //top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(a[startrow][j] + " ");
            }
            //right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(a[i][endcol] + " ");
            }
            //bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if(endrow==startrow){
                break;
                }
                System.out.print(a[endrow][j]+" ");
            }
            //left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if(endcol==startcol){
                break;
                }
                System.out.print(a[i][startcol] + " ");
            }
          
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();

    }
public static void main(String args[]){

Scanner sc = new Scanner (System.in);
        System.out.print("Enter dimensions : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter Array : ");
        int a[][] = new int [n][m];
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
        a[i][j]=sc.nextInt();
        }
        }
        System.out.print("Print spiral : ");
        printSpiral(a);
     
}
}