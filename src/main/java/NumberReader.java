
public class NumberReader {

	public static void main(String[] args) {
	
		for(int i= 0; i< 100; i++)
		{
			boolean flag5= false;
			boolean flag3= false;
			if(i%5 == 0)
			{
				flag5 = true;
				System.out.println("Buzz>>>>"+i);
			}
			if(i%3 == 0)
			{
				flag3 = true;
				System.out.println("Fizz>>>"+i);
			}
			if(flag5 && flag3)
			{
				System.out.println("FizzBuzz"+i);
			}
			
		}
	}

}
