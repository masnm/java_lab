package abc;

public class PairM {
	private int first;
	private int second;
	PairM ( int a, int b )
	{
		first = a;
		second = b;
	}
	int max () {
		return Math.max ( first, second );
	}
}
