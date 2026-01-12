package Day23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class NumberPlayList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<5;i++) {
			list.add(i);
		}
		Iterator<Integer> iter=list.iterator();
		
		while(iter.hasNext()) {
			Integer i=iter.next();
			System.out.println(i);
		}
		
		class MyConsumer implements Consumer<Integer>{

			@Override
			public void accept(Integer t) {
				System.out.println(t);	
			}
	}
		MyConsumer action=new MyConsumer();
		list.forEach(action);
		
		list.forEach(new MyConsumer() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);	
			}
		});
		
		Consumer<Integer> myaction=n->System.out.println(n);
		list.forEach(myaction);
		
		list.forEach(n->System.out.println(n));
		
		Function<Integer, Double> toDoubleValue=Integer::doubleValue;
		list.forEach(n->System.out.println(toDoubleValue.apply(n)));
		
		Predicate<Integer> isEvenFunction=n->n>0 && n%2==0;
		list.forEach(n->System.out.println("The number "+n+ "is to test even "+isEvenFunction.test(n)));
	}

}
