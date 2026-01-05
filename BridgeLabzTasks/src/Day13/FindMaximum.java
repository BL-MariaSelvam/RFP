package Day13;

public class FindMaximum <E extends Comparable <E>>  {
	E a,b,c;

	public FindMaximum(E a, E b, E c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public E findMax() {
		E max=a;
		
		if(b.compareTo(max)>0) {
			max=b;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		
		return max;
	}
	
	public static <E extends Comparable<E>> E findMax(E a, E b, E c) {
		FindMaximum<E> obj=new FindMaximum<E>(a, b, c);
		return obj.findMax();
	}

}
