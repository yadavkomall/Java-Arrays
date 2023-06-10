import java.util.Scanner;
//condition for binary search : given array should be sorted
class binarySearch{
public static void main(String args[]){
int a[] = new int [] {1,2,3,4,5,6,7,8,9,10};
System.out.print("Given array : ");
for(int i:a){
System.out.print(i+" ");
}System.out.println();
Scanner sc = new Scanner(System.in);
System.out.print("Enter element to search : ");
int n = sc.nextInt();
int li=0;
int hi=a.length-1;
int mid = (li+hi)/2;
while(li<=hi){
if(a[mid]==n){
System.out.println("Element found at "+mid);
break;
}
else if(a[mid]<n){
 li=mid+1;
}
else{
 hi=mid-1;
}
mid = (li+hi)/2;
}

if(li>hi){
System.out.println("Element not found ");
}

}
}