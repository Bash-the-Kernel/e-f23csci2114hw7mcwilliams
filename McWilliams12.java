//76576500
public class McWilliams12 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; ; i++) {
            num += i;  // num is triangle number i
            if (countDivisors(num) > 500)
            {
                System.out.println(Integer.toString(num));
                break;
            }
        }  
    }
    
    private static int countDivisors(int n) {
        int count = 0;
        int end = (int)Math.sqrt(n);
        for (int i = 1; i < end; i++) {
            if (n % i == 0)
                count += 2;
        }
        if (end * end == n)
            count++;
        return count;
 }

}
