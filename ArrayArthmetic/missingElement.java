class missingElement{
public static void main(String args[]){
int a[] = new int [] {33,34,35,36,37,38,39,41,42,43,44,45};
System.out.print("Given Array : ");
for(int i: a){
System.out.print(i+" ");
}
System.out.println();
int x =a[0];
int sum=0;
while(x<=a[a.length-1]){
sum= sum+x;
x++;
}
int sum2=0;
for(int i=0; i<a.length;i++){
sum2=sum2+a[i];
}
int missing = sum-sum2;
System.out.println("Missing number between the given Array is : "+missing);

}
}