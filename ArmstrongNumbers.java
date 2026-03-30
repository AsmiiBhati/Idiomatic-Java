public class ArmstrongNumbers {
    // User function Template for Java
    static boolean armstrongNumber(int n) {
        // code here
        int check = n;
        int finalsum = 0;
        if(100<=n && n<1000)
        {
            while(n>0)
            {
                int lastdigit = n%10;
                finalsum += Math.pow(lastdigit,3);
                n = n/10;
            }
            return finalsum == check;
        }
        else
        {
            return false;
        }
        
    }
}

