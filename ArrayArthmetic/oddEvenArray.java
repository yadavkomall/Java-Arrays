import java.util.ArrayList;
class oddEvenArray{
public static void main(String args[]){
System.out.print("Given Array : ");
int a[] = new int [] {1,2,3,4,5,6,7,8,9,10};
for(int i:a){
System.out.print(i+" ");
}System.out.println();
ArrayList <Integer> evenArray = new ArrayList<> ();
ArrayList <Integer> oddArray = new ArrayList<> ();
for(int i =0 ;i<a.length;i++){
if(a[i] % 2==0){
evenArray.add(a[i]);
}
else{
oddArray.add(a[i]);
}
}
int sumeve =0;
System.out.print("Even elements present in Array : ");
for(int i :evenArray){
System.out.print(i+" ");

sumeve= sumeve+i;
}System.out.println();
System.out.println("No. of even elements : "+ evenArray.size());
System.out.println("Sum of even elements : "+sumeve);

int sumodd =0;
System.out.print("Even elements present in Array : ");
for(int i :oddArray){
System.out.print(i+" ");
sumodd= sumodd+i;
}System.out.println();
System.out.println("No. of even elements : "+oddArray.size());
System.out.println("Sum of even elements : "+sumodd);

}
}