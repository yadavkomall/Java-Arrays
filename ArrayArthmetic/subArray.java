class subArray{
public static void main(String args[]){
 int a[] = new int[] {1,2,3,4,5};
       System.out.print("Given array   : ");
        for(int i:a){
        System.out.print(i+" ");
        } System.out.println();
       System.out.println("Possible subarrays  : ");
        for(int i=0;i<a.length;i++){
        for(int j=i;j<a.length;j++){
        for(int k=i;k<=j;k++){
        System.out.print(a[k]+" ");
        }System.out.println();
        }
        }
}
}