public class Variables {

    public static void alter(int[] a){
        System.out.println(a[0]);
        a[0]++;
        System.out.println(a[0]);
    }

    public static void main(String[] args) {
        int a[] =
                {10};
        System.out.println(a[0]);
        alter(a);
        System.out.println(a[0]);

    }
}