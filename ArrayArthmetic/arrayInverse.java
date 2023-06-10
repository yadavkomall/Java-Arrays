4class arrayInverse{
public static void main(String args[]){
//conditon to find inverse array
//1.array shoud contain all element from 0 to array.length-1
//2.no element should repeat and duplicate

       int a[] = new int[] {3,4,1,2,0};
       System.out.print("Given array   : ");
       
        for(int i:a){
        System.out.print(i+" ");
        } System.out.println();
        
        int inv[]=new int[a.length];
        for(int i=0;i<a.length;i++){
        int v =a[i];
        inv[v]=i;
        }
        
        System.out.print("Inverse array : ");
        for(int i:inv){
        System.out.print(i+" ");
        }System.out.println();
}
}