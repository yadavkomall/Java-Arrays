class secondMaxMin {
public static void main(String args[]){
System.out.print("Given Array : ");
int a[] = new int[] {50,20,90,10,40,60,300};
for(int i:a){
System.out.print(i+" ");
}System.out.println();
int largest = Integer.MIN_VALUE;
int secondmax = Integer.MIN_VALUE;
for(int i=0; i<a.length;i++){
if(a[i]>largest){
secondmax=largest;
largest=a[i];

}
else if(a[i]>secondmax && a[i]!=largest){
secondmax =a[i];
}
}
System.out.println("Second Maximum value : "+secondmax);

int smallest = Integer.MAX_VALUE;
int secondmin = Integer.MAX_VALUE;
//{50,20,90,10,40,60,300}
for(int i=0;i<a.length;i++){
if(a[i]<smallest){
secondmin= smallest;
smallest=a[i];
}
else if(a[i]<secondmin && a[i]!=smallest){
secondmin=a[i];
}
}
System.out.println("Second Minimum value : "+secondmin);
}
}

}
}