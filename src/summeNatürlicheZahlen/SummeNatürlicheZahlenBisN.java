package summeNatürlicheZahlen;

public class SummeNatürlicheZahlenBisN {

	public static void main(String[] args) {
		System.out.println("_____Rekursiv_____");
		int zahlrek=2;
		System.out.println(SummeRekursiv(zahlrek));
		
		System.out.println("_____Endekursiv_____");
		int zahlendrek=2;
		int menge=3;
		System.out.println(SummeEndrekursiv(menge,zahlendrek));
	}
	
	static int SummeRekursiv(int n)
	{
		if(n==0)
		{
			return 0;
		}else
		{
			return n+SummeRekursiv(n-1);
		}
	}
	static int SummeEndrekursiv(int m,int n)
	{
		 if (n==0)
		 {
			 return m;
		 }else
		 {
			 return SummeEndrekursiv(m+n, n-1);
		 }
	}
}
