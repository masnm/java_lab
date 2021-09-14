import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main
{
	public static void main(String[] args)
	{
		FastScanner fs = new FastScanner();
		int t = fs.nextInt ();
		int pv[] = new int[200005];
		int ans = 10000000, dis;

		int tt = 0;
		while ( tt < t ) {
			int n = fs.nextInt ();
			ans = 10000000;
			for ( int i = 0 ; i <= n ; ++i ) pv[i] = -1;
			int ar[] = fs.readArray ( n );
			for ( int i = 0 ; i < n ; ++i ) {
				if ( pv[ar[i]] == -1 ) {
					pv[ar[i]] = i;
				} else {
					dis = i - pv[ar[i]] + 1;
					pv[ar[i]] = i;
					ans = Math.min ( ans, dis );
				}
			}
			if ( ans == 10000000 ) {
				System.out.println ( "-1" );
			} else {
				System.out.println ( ans );
			}

			++tt;
		}
		// System.out.println("Hello World");
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}

	}
}
