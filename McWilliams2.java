//4613732
public class McWilliams2 {
    public static void main(String[] args) {
        int max_fib = 4000000;
        int even_total = 0;
        int previous_fib = 1;
        int current_fib = 1;
        while(current_fib < max_fib)
        {
            current_fib += previous_fib;
            if(current_fib%2 == 0)
            {
                even_total+=current_fib;
            }
            previous_fib = current_fib - previous_fib;
        }
        System.out.println(even_total);

    }
    
}
