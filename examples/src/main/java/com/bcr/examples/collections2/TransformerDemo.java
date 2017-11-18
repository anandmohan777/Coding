package bcr.examples.collections2;

import java.util.ArrayList;
import java.util.Collection;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.learning.bcr.examples.enumexample.Type;

class SampleObject{
	int id;
	String name;
	
	public SampleObject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class TransformerDemo {
	public static void main(String[] args) {
		TransformerDemo d = new TransformerDemo();

		SampleObject s1 = new SampleObject(1, "a1");
		SampleObject s2 = new SampleObject(2, "a2");
		SampleObject s4 = new SampleObject(4, "a4");
		SampleObject s3 = new SampleObject(3, "a3");

		Collection<SampleObject> c = new ArrayList<>();
		c.add(s1);
		c.add(s2);
		c.add(s4);
		c.add(s3);	

		System.out.println("##### Tranform to int list #####");
		System.out.println(d.transformSampleObjectToListOfId(c));
		
		Type.CURRENT.getExchangeRateValue();

	}

	private Collection<Integer> transformSampleObjectToListOfId(Collection<SampleObject> c){
		return Collections2.transform(c, new Function<SampleObject, Integer>() {
			@Override
			public Integer apply(SampleObject input) {
				return input.getId()%2 == 0? null: input.getId();
			}

		});
	}	
}
