import java.util.HashSet;
class commonBtwThree{
public static void main(String args[]){
int a[] = new int [] {12,13,14,15,11,18,19,20,19};
int b[] = new int [] {11,43,65,15,6,19,11,12};
int c[] = new int [] {1,2,3,4,12,1,2,19,18};
System.out.print("Given Array 1 :");
for(int i:a){
System.out.print(i+" ");
}System.out.println();
System.out.print("Given Array 2 :");
for(int i:b){
System.out.print(i+" ");
}System.out.println();
System.out.print("Given Array 3 :");
for(int i:c){
System.out.print(i+" ");
}System.out.println();
HashSet <Integer> hs1= new HashSet<>();
HashSet <Integer> hs2= new HashSet<>();
HashSet <Integer> hs3= new HashSet<>();
for(int i : a){
hs1.add(i);
}
for(int i:b){
hs2.add(i);
}
for(int i:c){
hs3.add(i);
}

System.out.println("common elements between Given two arrays are : ");
for(int i:hs3){
boolean x = hs1.add(i);
boolean y = hs2.add(i);
if(x==false && y==false){
System.out.println(i);
}
}

}
}

