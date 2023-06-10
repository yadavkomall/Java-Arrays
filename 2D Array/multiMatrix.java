import java.util.Scanner;
class multiMatrix{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter row of matrix1 :");
int r1= sc.nextInt();
System.out.print("Enter column of matrix1 :");
int c1= sc.nextInt();
System.out.print("Enter row of matrix2 :");
int r2= sc.nextInt();
System.out.print("Enter column of matrix2 :");
int c2= sc.nextInt();

if(c1==r2){
int a[][] = new int[r1][c1];
System.out.println("Enter matrix1");
for(int i=0; i<=r1-1;i++){
for(int j=0; j<=c1-1;j++){
a[i][j]= sc.nextInt();
}
}

int b[][] = new int[r2][c2];
System.out.println("Enter matrix2");
for(int i=0; i<=r2-1;i++){
for(int j=0; j<=c2-1;j++){
b[i][j]= sc.nextInt();
}
}

int c[][]= new int[r1][c2];
System.out.println("Resultant matrix");
for(int i=0;i<=r1-1;i++){
for(int j=0;j<=c2-1;j++){
for(int k=0;k<=r1-1;k++){ 
c[i][j] += a[i][k]*b[k][j];
}
}
}

for(int i=0;i<=r1-1;i++){
for(int j=0;j<=c2-1;j++){
System.out.print(c[i][j]+" " );
}System.out.println();
}

}

else{
System.out.println("Multiplication not possible");
}
}
}