package Task_2;

public enum Cars {
    Car1("Toyota", "C-HR", "175", "7800000", "Orange"),
    Car2("Nissan","Kicks", "200", "220000", "Yellow"),
    Car3("BMW", "iX M60", "195", "8000000", "DarkBlue"),
    Car4("Ford", "Maverick", "210", "9099000", "Blue"),
    Car5("Honda", "Civic", "200", "650000", "White"),
    Car6("VAZ", "2114", "180", "300000", "Burgundi");
    public final String model;
    public final String speed;
    public final String mark;
    public final String price;
    public final String color;

    public String getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    Cars(String mark, String model, String speed, String price, String color) {
        this.model = model;
        this.speed = speed;
        this.mark = mark;
        this.price = price;
        this.color = color;

    }}
