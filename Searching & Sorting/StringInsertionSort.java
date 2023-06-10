class StringInsertionSort{
public static void main(String args){
System.out.print("Given Array  : ");
String a[] = new String[] {"c","h","f","j","b","g","d","i","a","e"};
for(String i:a){
System.out.print(i+" ");}
System.out.println();
for(int i=1;i<a.length;i++){
String current = a[i];
int j=i;
while(j>0 && current.compareTo(a[j-1])<0){
a[j]=a[j-1];
j--;
}
a[j]=current;
}
System.out.print("Sorted Array : ");
for(String i :a){
System.out.print(i+" ");
}System.out.println();
}
}