//31875000
public class McWilliams9 {
    public static void main(String[] args) {
        for(int i = 0; i<1000; i++)
        {
            for(int j=i; j<1000-i; j++)
            {
                double root = Math.sqrt(i*i +j*j);
                if(root%1 == 0)
                {
                    if(i+j+root == 1000 & i*j*root !=0)
                    {
                        System.out.println((int)i*j*root);
                        break;
                    }
                }
            }
        }
        
    }
    
}
