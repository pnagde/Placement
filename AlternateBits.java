package begin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import javax.sound.midi.SysexMessage;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		int i=11;
		System.out.println(match(i));
		int prevDigit=0;//0
		if(i%2==0) {
			prevDigit=1;
		}
		System.out.println(recursive(prevDigit, i));
	}
	static public boolean match(int n) {//3,5
		int prevDigit=0;//0
		if(n%2==0) {
			prevDigit=1;
		}
		while(n!=0) {//3>0
			if((prevDigit==0 && (n&1)==0) || (prevDigit==1 && (n&1)==1) ){
				return false;
			}
			if((n & 1)==1 && prevDigit==0) {//101 => 001 => prev=0
				prevDigit=1;// prev=1
			}else if((n & 1)==0 && prevDigit==1)
			{
				prevDigit=0;
			}
			n>>=1;
		}
		return true;
	}
	static public boolean recursive(int prev,int n) {
		if(n==0) {
			return true;
		}
		if((prev==0 && (n&1)==0) || (prev==1 && (n&1)==1) ){
			return false;
		}
		if((n & 1)==1 && prev==0) {//101 => 001 => prev=0
			prev=1;// prev=1
		}else if((n & 1)==0 && prev==1)
		{
			prev=0;
		}
		return recursive(prev, n>>1);
	}
	static public int toCountDigit(int k) {
		int count=0;
		while(k!=0) {
			count++;
			k>>=1;
		}
		return count;
	}
}
