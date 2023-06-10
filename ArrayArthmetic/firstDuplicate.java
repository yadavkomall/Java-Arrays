import java.util.HashSet;
class firstDuplicate{
public static void main(String args[]){
System.out.print("Given array : ");
int a[] = new int[] {1,2,3,4,5,3,8,2,6};
for(int i:a){
System.out.print(i+" ");
}
System.out.println();
int temp = -1;
HashSet<Integer> hs = new HashSet<>();
for(int i=a.length-1;i>=0;i--){
if(hs.contains(a[i])){
temp=i;
}
else{
hs.add(a[i]);
}
}
if(temp != -1){
System.out.println("First duplicate element is "+a[temp]);
}
}
}