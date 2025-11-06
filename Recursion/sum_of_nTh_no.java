package Recursion;

public class sum_of_nTh_no {

    public static int sum_of_Nno(int n){
        if (n==1) {
            return 1;
        }

        return (n+ sum_of_Nno(n-1));
    }

    public static void main(String[] args) {
        System.out.println(sum_of_Nno(10));
    }
}