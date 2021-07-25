public class BufferReader {
	public static long reverse (long digit)
	  {
	    long rev = 0;

	    for (int i = 0; i < 32; i++)
	      {
		rev <<= 1;
		if ((digit & (1 << i)) != 0)
		  rev |= 1;
	      }

	    return rev;

	  }

	public static void main(String[] args) throws IOException {
		String line="";
		Reader bf=new InputStreamReader(System.in);
		
		int data=bufferReader.read();
		while(data!=-1) 
		{
			char theChar = (char) data;
		    data = bf.read();
		    line += theChar;
		}
		String a[]=line.split("\n");
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=Integer.parseInt(a[i]);
		}
		for (int i = 0; i < a.length - 1; i++)
		      System.out.print (reverse (b[i]) + ",");
		    System.out.print (reverse (b[a.length - 1]));
		bf.close();
	}
}
