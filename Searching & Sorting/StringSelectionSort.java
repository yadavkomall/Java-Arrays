class StringSelectionSort{
public static void main(String args[]){
System.out.print("Given Array  : ");
String a[]= new String []{"d","a","g","e","b","i","f","c","j","h"};
for(String i:a){
System.out.print(i+" ");
}System.out.println();
for(int i=0; i<a.length;i++){
int min=i;
for(int j=i+1;j<a.length;j++){
if(a[min].compareTo(a[j])>0){
min=j;
}
}
String temp= a[i];
a[i]=a[min];
a[min]=temp;
}
System.out.print("Sorted Array : ");
for(String i:a){
System.out.print(i+" ");
}
System.out.println();
}
}