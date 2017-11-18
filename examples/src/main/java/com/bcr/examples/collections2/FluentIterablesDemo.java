package bcr.examples.collections2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;

public class FluentIterablesDemo {
	public static void main(String[] args) {
		FluentIterablesDemo d = new FluentIterablesDemo();

		SampleObject s1 = new SampleObject(1, "a1");
		SampleObject s2 = new SampleObject(2, "a2");
		SampleObject s4 = new SampleObject(4, "a4");
		SampleObject s3 = new SampleObject(3, "a3");

		Collection<SampleObject> c = new ArrayList<>();
		c.add(s1);
		c.add(s2);
		c.add(s4);
		c.add(s3);
		new ArrayList<String>(null);

		System.out.println("##### Tranform to int list #####");
		System.out.println(d.transformSampleObjectToListOfId(c));

	}

	private List<Integer> transformSampleObjectToListOfId(Collection<SampleObject> c){
		
		return FluentIterable.from(c).filter(/*new Predicate<SampleObject>() {
			@Override
			public boolean apply(SampleObject input) {
				return input!=null;
			}
		} */Predicates.notNull()).transform(new Function<SampleObject, Integer>(){
			@Override
			public Integer apply(SampleObject input) {
				return input.getId()%2 == 0? null : input.getId();
			}

		}).filter(Predicates.notNull()).toList();
		
		
	}
}
