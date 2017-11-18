package bcr.examples.enumexample;

public enum Type {

	CURRENT("CURRENT") {
		@Override
		public int getExchangeRateValue() {
			return 1;
		}
	},SAVING("SAVING") {
		@Override
		public int getExchangeRateValue() {
			return 2;
		}
	};

	private String value;

	Type(final String value){
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static Type forValue(final String value) {
		if(value == null) {
			return null;
		}

		for(final Type item : Type.values()) {
			if(item.getValue().equals(item)) {
				return item;
			}
		}
		return null;
	}

	public abstract int getExchangeRateValue();
}

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
