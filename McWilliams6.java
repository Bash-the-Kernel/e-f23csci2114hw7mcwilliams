//25164150
public class McWilliams6 {
    public static void main(String[] args) {
        int SumofSquares = 0;
        int Sums = 0;
        for(int i = 0; i<=100;i++)
        {
            SumofSquares += i*i;
        }
        for(int i = 0; i <= 100; i++)
        {
            Sums +=i;
        }
        System.out.println(Math.abs(SumofSquares - Sums*Sums));
    }
}
