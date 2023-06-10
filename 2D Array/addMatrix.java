import java.util.Scanner;
class addMatrix{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter no. of rows of matrix1 :");
int r1 = sc.nextInt();
System.out.print("Enter no. of column of matrix1 :");
int c1 = sc.nextInt();
System.out.print("Enter no. of rows of matrix2 :");
int r2 = sc.nextInt();
System.out.print("Enter no. of column of matrix2 :");
int c2 = sc.nextInt();


if(r1==r2 && c1==c2){

System.out.println("Enter matrix1");
int a[][]= new int [r1][c1];
for(int i=0;i<=r1-1;i++){
for(int j =0; j<=c1-1;j++){
a[i][j] = sc.nextInt();
}
}

System.out.println("Enter matrix2");
int b[][]= new int [r2][c2];
for(int i=0;i<=r2-1;i++){
for(int j =0; j<=c2-1;j++){
b[i][j] = sc.nextInt();
}
}

System.out.println("resultant matrix");
int c[][]= new int [r1][c1];
for(int i=0;i<=r1-1;i++){
for(int j =0; j<=c1-1;j++){
c[i][j] = a[i][j]+b[i][j];
}
}

for(int i=0;i<=r1-1;i++){
for(int j =0; j<=c1-1;j++){
System.out.print(c[i][j]+" ");
}System.out.println();
}
}
else
    System.out.println("Addition not possible");
}
}