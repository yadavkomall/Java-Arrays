class searchMaxMin{
public static void main(String args[]){
System.out.print("Given Array : ");
int a[] = new int[] {90,20,50,10,40,60,300};
for(int i:a){
System.out.print(i+" ");
}System.out.println();
int max = a[0];
for(int i=0; i<a.length;i++){
if(max<a[i]){
max=a[i];
}
}
System.out.println("Maximum value : "+ max);
int min=a[0];
for(int i=0;i<a.length;i++){
if(min>a[i]){
min=a[i];
}
}
System.out.println("Minimum value : "+ min);
}
}
