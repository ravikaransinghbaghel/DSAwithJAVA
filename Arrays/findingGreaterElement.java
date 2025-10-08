package Arrays;

public class findingGreaterElement {
    public static void main(String[] args) {
        int a[]={1,42,64,1,234,45,34,2,4};
        int large = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>large) {
                large = a[i];
            }
        }
        System.out.println("Largest element is: " + large);
    }
}
