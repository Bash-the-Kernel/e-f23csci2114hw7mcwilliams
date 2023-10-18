//232792560
public class McWilliams5 {
    public static void main(String[] args) {
        int numOfDiv = 0;
        int maxInt = 2147483647;
        for(int i = 1; i<maxInt; i++)
        {
            for(int j = 1; j<=20; j++)
            {
                if(i%j==0)
                {
                    numOfDiv++;
                }
            }
            if(numOfDiv == 20)
            {
                System.out.println(i);
                break;
            }
            else
            {
                numOfDiv = 0;
            }
        }
    }
}
