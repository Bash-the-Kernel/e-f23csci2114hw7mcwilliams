//906609
public class McWilliams4 {
    public static void main(String[] args) {
        int biggest_palindrome = 0;
        for(int i = 100; i < 1000; i++)
        {
            for(int j = 100; j < 1000; j++)
            {
                int product = i*j;
                String prodstr = Integer.toString(product);
                String reversedStr = "";
                
                for (int k = 0; k < prodstr.length(); k++) {
                  reversedStr = prodstr.charAt(k) + reversedStr;
                }
                int reverseProduct = Integer.parseInt(reversedStr);
                if(reverseProduct == product)
                {
                    if(product > biggest_palindrome)
                    {
                        biggest_palindrome = product;
                    }
                }
            }
        }
        System.out.println(biggest_palindrome);
    }
}
    
