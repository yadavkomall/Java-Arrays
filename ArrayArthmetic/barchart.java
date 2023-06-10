import java.util.Scanner;
class barchart{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of coordinates : ");
int c = sc.nextInt();
System.out.print("Enter cooredinates : ");
int a[]= new int [c];
for(int i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
int max = a[0];
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
}

for(int i=max;i>=1;i--){
for(int j=0;j<a.length;j++){
if(a[j]>=i){
System.out.print("|");
}
else{
System.out.print(" ");
}
}
System.out.println();
}


}
}