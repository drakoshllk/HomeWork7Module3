class Phone implements Comparable<Phone> {
    private String name;
    private String model;
    private int price;

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public int compareTo(Phone phone) {
        return phone.price - this.price;
    }
}