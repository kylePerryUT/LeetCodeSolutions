package reverseInteger;

public class ReverseInteger {	
	 public static int reverse(int x) {
        long mod = 10;
        long reverse = 0;
        while(x != 0){
            long temp = x % mod;
            long prevMod = mod/10;
            reverse *= 10;
            //check bounds
            long test = reverse + (temp/prevMod);
            double bound = Math.pow(2, 31);
            double lowBound = -bound;
            double upBound = bound - 1;
            if(test < lowBound || test > upBound){
                return 0;
            }
            reverse = test;
            x -= temp;
            mod *= 10;
            
        }
        
        return (int) reverse;
    }
}
