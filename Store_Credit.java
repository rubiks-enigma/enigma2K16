
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

class StoreCredit {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
		StringBuilder sb = new StringBuilder();
		int t = Reader.nextInt();
		int k=1;
		while(t-->0){
			int c = Reader.nextInt();
			int n = Reader.nextInt();
			int[] a = new int[n];
			
			for(int in=0; in<n; in++){
				a[in]=Reader.nextInt();
				
			}
			int i=0,j=0;
			op:
			for(i=0; i<a.length; i++){
				for(j=0; j<a.length; j++){
					if(a[i]+a[j]==c && i!=j) break op;
				}
			}
			sb.append("Case #"+k+":"+" "+(i+1)+" "+(j+1)+"\n");
			k++;
		}
		System.out.println(sb);
	}
}

class Reader {
	static BufferedReader reader;
	static StringTokenizer tokenizer;
	static BigInteger big;
	static void init(InputStream input) {
		reader = new BufferedReader(new InputStreamReader(input));
		tokenizer = new StringTokenizer("");
	}
	static String next() throws IOException {
		while ( ! tokenizer.hasMoreTokens() ) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	static int nextInt() throws IOException {
		return Integer.parseInt( next() );
	}
}


