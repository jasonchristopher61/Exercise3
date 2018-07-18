package Testprogram;

public class Factorial {
	public static int printIntFactorials(int i, int fn)
	{
	    while (true)
	    {
	        System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
	        if (Integer.MAX_VALUE / fn < (i+1)) {
	            System.out.printf("The factorial of %d is out of range.\n", (i+1));
	            break;
	        }
	        i++;
	        fn *= i;

	    }
	return fn;
	}

	public static long printLongFactorials(long input,long factorial)
	{

	    while (true)
	    {
	        System.out.printf("The factorial of %1$d is is %2$d.\n", input, factorial);
	        if (Long.MAX_VALUE / factorial < (input+1)) {
	            System.out.printf("The factorial of %d is out of range.\n", (input+1));
	            break;
	        }
	        input++;
	        factorial *= input;
	    }
	    return factorial;
	}
	
	

}
