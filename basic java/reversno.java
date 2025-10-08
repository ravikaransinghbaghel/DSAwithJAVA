public class reversno {
    public static void main(String[] args) {
        long rev = 0;
        long n = 751954633;
        while (n != 0) {
            long rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        System.out.println(rev);

        // while (n != 0) {
        //     long rem = n % 10;
        //     // rev = (rev * 10) + rem;
        //     n = n / 10;
        //     System.out.print(rem);
        // }


    }
}
