import java.util.Map;
import java.util.HashMap;
import java.util.Set;
class ktimesDuplicate{
public static void main(String args[]){
int a[] = new int[] {1,2,8,4,4,5,6,4,7,27,18,7,8,15,8,7,6,4};
System.out.print("Given Array : ");
for(int i:a){
System.out.print(i+" ");
}System.out.println();

Map<Integer,Integer> hm = new HashMap<>();
for(int i : a){
Integer count = hm.get(i);
if(count == null){
hm.put(i,1);
}
else{
count = count+1;
hm.put(i,count); 
}
}
System.out.println("Duplicate elements : ")
Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
for(Map.Entry<Integer,Integer> me :es){
if(me.getValue()>1){
System.out.println(me.getKey());
}
}
}
}