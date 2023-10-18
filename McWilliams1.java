//233168
public class McWilliams1
{
    public static void main(String[] args) {
        int max = 1000;
        int total = 0;
        for(int i = 0; i < max; i++)
        {
            if(i%3==0 ||i%5==0)
            {
                total+=i;
            }
        }
        System.out.println(total);
    }
}
