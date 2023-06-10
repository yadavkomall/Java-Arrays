class StringBubbleSort{
public static void main(String args[]){
System.out.print("Given Array  : ");
String a[] = new String[] {"b","d","g","f","a","e","c"};
for(String i:a){
System.out.print(i+" ");
}System.out.println();
for(int i=0;i<a.length-1;i++){
for(int j=0;j<a.length-1-i;j++){
if(a[j].compareTo(a[j+1])>0){
String temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.print("Sorted Array : ");
for(String i:a){
System.out.print(i+" ");
}
System.out.println();
}}