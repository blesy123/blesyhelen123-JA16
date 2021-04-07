package lab;

public class Sum {
	 public static int sumOfSeries(int n)
	    {
	        int sum = 0;
	        for (int x=1; x<=n; x++)
	            sum += x*x*x;
	        return sum;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
        System.out.println(sumOfSeries(n));
	}

}
