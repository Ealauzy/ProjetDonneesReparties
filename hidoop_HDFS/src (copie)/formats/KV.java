package formats;
import java.io.Serializable;

public class KV implements Serializable{

	public static final String SEPARATOR = "<->";
	
	public String k;
	public String v;
	
	public KV() {}
	
	public KV(String k, String v) {
		super();
		this.k = k;
		this.v = v;
	}

	public String toString() {
		return "KV [k=" + k + ", v=" + v + "]";
	}
	
	public String getV() {
		return this.v;
	}
	
	public String getK() {
		return this.k;
	}
	
}
