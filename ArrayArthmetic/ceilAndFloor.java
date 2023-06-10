import java.util.Scanner;
class ceilAndFloor{
public static void main(String args[]){
//ceil = upperbound
//floor = lowerbound
//condition= Array should be sorted
Scanner sc = new Scanner(System.in);
int a[] = new int[] {10,20,30,40,50,60,70,80,90};
System.out.print("Given Array : " );
for(int i:a){
System.out.print(i+" ");
}System.out.println();
System.out.print("Enter element : " );
int ele = sc.nextInt();
int li=0;
int hi=a.length-1;
int mid=(li+hi)/2;
int ceil=0;
int floor=0;
while(li<=hi){
if(a[mid]==ele){
ceil=a[mid];
floor=a[mid];
break;
}
else if(a[mid]<ele){
li=mid+1;
floor=a[mid];
}
else if(a[mid]>ele){
hi=mid-1;
ceil=a[mid];
}
mid=(li+hi)/2;
}

System.out.println("ceil value   : "+ceil);
System.out.println("floor value  : "+floor);
       
}
}