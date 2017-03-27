package maestro.headfirst.experiments2.decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * Write your own Java I/O Decorator
 * 
 * 1. Extend the FilterInputStream, the 
 * abstract decorator for all InputStreams
 * 
 * 2. Then implement two read methods.
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
		
	}
	
	public int read() throws IOException{
		int c = super.read();
		return ( c==-1 ? c : Character.toLowerCase(c));
	}
	
	public int read( byte b[], int offset, int len) throws IOException{
		int result = super.read(b, offset, len);
		
		for (int i=offset; i<offset+result; i++){
			b[i] = (byte) Character.toLowerCase(b[i]);
		}
		
		return result;
	}

}
