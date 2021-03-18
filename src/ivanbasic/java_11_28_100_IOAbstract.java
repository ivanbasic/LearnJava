package ivanbasic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class java_11_28_100_IOAbstract implements Lesson {

 
	public void main() {
	 	}

}
class xInputStream extends InputStream {
	public int read() throws IOException {
		return 0;
	}
}
class xOutputStream extends OutputStream {
	public void write(int b) throws IOException {		
	}
}
class xReader extends Reader {
	public int read(char[] cbuf, int off, int len) throws IOException {
		return 0;
	}
	public void close() throws IOException {
	}
	
}
class xWriter extends Writer {
	public void write(char[] cbuf, int off, int len) throws IOException {
	}
	public void flush() throws IOException {
	}
	public void close() throws IOException {
	}
}
