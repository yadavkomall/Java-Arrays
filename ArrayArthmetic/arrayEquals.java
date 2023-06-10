class arrayEquals{
public static void main(String args[]){
int a[] = new int[] {1,2,3,4,5,6};
int b[] = new int[] {6,5,4,9,0,6};
boolean isequal = false;
if(a.length!=b.length){
System.out.println("not equal");
System.exit(0);
}

for(int i=0;i<a.length;i++){
   isequal= false;
    for(int j=0;j<b.length;j++){
if(a[i]==b[j]){
isequal=true;
break;
}
}
  if(!isequal){
  break;
  }}  
    
if(isequal){
System.out.println("Given is equal");
}
else{
System.out.println("Given is not equal");
}

}
}