 import java.util.Set;
import java.util.HashSet;
class twiceDuplicate{
public static void main(String args[]){
int a[] = new int [] {1,2,3,10,43,13,4,3,5,6,2};

System.out.print("Given Array : ");

for(int i:a){

System.out.print(i+" ");

}

System.out.println();

Set<Integer> s =new HashSet<>();

System.out.println("Duplicate element : ");

for(int i :a){

if(s.add(i)==false){

System.out.println(i);

}

}

}
}