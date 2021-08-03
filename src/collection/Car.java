package collection;

class Car implements Comparable<Car> {
	String brand;
	String model;
	String type;
	int id;

	Car(String brand, String model, String type, int id) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.id = id;
	}

	public int compareTo(Car st) {
		if (id == st.id)
			return 0;
		else if (id > st.id)
			return -1;
		else
			return 1;
	}

}