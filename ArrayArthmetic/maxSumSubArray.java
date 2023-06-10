class maxSumSubArray{
public static void main(String args[]){
int a[] = new int[]{4, -2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print("Given array : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        int start = 0;
        int end = 0;
        int s = 0;
        int maxsum = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < a.length; i++) {
            current = current + a[i];
            if (current > maxsum) {
                maxsum = current;
                start = s;
                end = i;
            }
            if (current < 0) {
                current = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum sum of sub array is : " + maxsum);
        System.out.println("Index position of sub array are - ");
        System.out.println("start : " + start);
        System.out.println("end : " + end);

}
}