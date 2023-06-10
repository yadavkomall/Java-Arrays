import java.util.HashSet;
class commonBtwTwo{
public static void main(String args[]){
int a[] = new int [] {12,13,14,15,17,18,19,20,19};
int b[] = new int [] {11,43,65,15,435,654,6,19,11,12};
System.out.print("Given Array 1 :");
for(int i:a){
System.out.print(i+" ");
}System.out.println();
System.out.print("Given Array 2 :");
for(int i:a){
System.out.print(i+" ");
}System.out.println();
HashSet <Integer> hs1= new HashSet<>();
HashSet <Integer> hs2= new HashSet<>();

for(int i : a){
hs1.add(i);
}
for(int i:b){
hs2.add(i);
}
System.out.println("common elements between Given two arrays are : ");
for(int i:hs1){
  boolean x = hs2.add(i);
if(x==false){
System.out.println(i);
}}

}
}