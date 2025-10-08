import java.util.*;

public class changingNumber {
    public static int binToDec(int n) {
        int rem, decNum = 0;
        int pow = 0;
        //int a = n; // n == 1001
        while (n > 0) {
            rem = n % 10;// 1001 ==>1,100==>0 ,10==>0 , 1==>1
            decNum = decNum + (int) (Math.pow(2, pow) * rem); // 0+2^0*1 =1, 1+2^1*0 =1, 1+2^2*0 =1 ,1+2^3*1 =9
            n /= 10;// 1001==>100,100==>10, 10==>1 , 1=> n==0
            pow++;
        }
        return decNum; // dec num = 9
    }

      public static void decToBin(int n) {
        int rem, binNum = 0;
        int pow = 0;
        int a = n; // n == 9
        while (n > 0) {
            rem = n % 2;//  9==>1,4==>0 ,2==>0 , 1==>1
            binNum = binNum + (int) (Math.pow(10, pow) * rem); // 0+10^0*1 =1, 1+10^1*0 =1, 1+10^2*0 =1 ,1+10^3*1 =1001
            n /= 2;// 9==>4,4==>2, 2==>1 , 1=> n==0
            pow++;
        }

        System.out.println(a + " change into binNum : " + binNum);
        
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary num for changing into decimal number : ");
        n = sc.nextInt();
        System.out.println(n + " change into decNum : " + binToDec(n));
        decToBin(binToDec(n));
    }
}
