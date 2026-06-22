import java.util.Scanner;
class SumOfPrimeNumber
{


public static boolean isPrime(int num)
{
  if(num == 1)
  {
    return false;
  }
int j ;
 
 for(j  = 2 ; j<num ; j++)
 {
   if(num%j==0)
   {
      return false;
   }
 }
if(j==num)
{
return true;
}
 
else
{
return false;
} 
}

public	static	void	main(String[]	args)	
	{	
		Scanner	scn=new	Scanner(System.in);	
		System.out.println("Enter	the	range	to	print	sum	of	prime	Nos.....");	
		int	range=scn.nextInt();	
		int	sum=0;	
		for(int	i=1;i<=range	;i++)	
		{	
			if(isPrime(i))	
			sum=sum+i;	
		}	
		System.out.println(sum);	
	
	}
}