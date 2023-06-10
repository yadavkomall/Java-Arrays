class mergeArray{
public static void main(String args[]){
nt a[] = new int[] {1,2,3,4,5};
int b[] = new int [] {6,7,8,9,10};
System.out.print("Given Array 1 : ");
for(int i:a){
System.out.print(i+" ");
}System.out.println();
System.out.print("Given Array 2 : ");
for(int i:b){
System.out.print(i+" ");
}System.out.println();
System.out.print("Merged Array : ");
int c[] = new int [a.length+b.length];
for(int i=0; i<a.length;i++){
c[i]=a[i];
}
for(int i=0;i<b.length;i++){
c[a.length+i]=b[i];
}
for(int i:c){
System.out.print(i+" ");
}System.out.println();

}
}