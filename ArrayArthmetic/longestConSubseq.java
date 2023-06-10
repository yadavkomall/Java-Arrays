import java.util.HashSet;
class longestConSubseq{
public static void main(String args[]){
int a[] = new int []{3,9,1,10,20,2,5,6,7,8};
  System.out.print("Given Array : ");
  for(int i:a){
  System.out.print(i+" ");
  }
  System.out.println();
  HashSet <Integer> hs = new HashSet<>();
  for(int i=0; i<a.length;i++){
  hs.add(a[i]);
  }
  int length=0;
  for(int i=0;i<a.length;i++){
    if(! hs.contains(a[i]-1)){
    int num = a[i];
    while(hs.contains(num)){
    num++;
    }
    if(length<num-a[i]){
        length = num-a[i];
    }  
    }  
  }
  System.out.println("length of longest subsequence is "+length);
}
}