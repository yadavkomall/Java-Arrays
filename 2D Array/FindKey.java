class FindKey{

 public static boolean findkey(int a[][], int key) {
        int i = 0;
        int j = a[0].length - 1;
        while (i <= a.length - 1 && j >= 0) {
            if (a[i][j] == key) {
                System.out.println("key found at " + "(" + i + " " + j + ")");
                return true;
            }
            if (a[i][j] < key) {
                i++;
            } else if (a[i][j] > key) {
                j--;
            }
        }
        System.out.println("key not found");
        return false;
    }

public static void main(String args[]){
 int a[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
      
        int key=15;
        findkey(a,key);
}
}