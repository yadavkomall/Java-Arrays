import java.util.HashSet;
class removeDuplicate{
public static void main(String args[]){
int a[] = new int[]{1, 2, 5, 7, 5, 3, 2, 9, 5, 1, 4, 7, 2, 5};
        System.out.print("Given array : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        System.out.print("Resultant array : ");
        for (int i : hs) {
        System.out.print(i + " ");
        }
}
}