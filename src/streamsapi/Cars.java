package streamsapi;


class Cars {
    String brand;
    String model;
    String type;
    int id;

    
    Cars(String brand, String model, String type, int id) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}