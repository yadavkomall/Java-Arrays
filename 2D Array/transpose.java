import java.util.Scanner;
class transpose{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the dimensions of the matrix ");
int r = sc.nextInt();
int c = sc.nextInt();

System.out.println("Enter the matrix ");
int a[][] = new int[r][c];
for(int i=0; i<=r-1;i++){
for(int j=0; j<=c-1;j++){
a[i][j]= sc.nextInt();
}
}
System.out.println("transpose of the matrix ");
for(int i=0; i<=c-1;i++){
for(int j=0; j<=r-1;j++){
System.out.print(a[j][i]+" ");
}System.out.println();

}
}
}