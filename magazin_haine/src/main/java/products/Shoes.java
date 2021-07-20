package products;

public class Shoes extends Product{
    public Shoes(String name, String material, String color, String size, double price, int total_nr) {
        super(name, material, color, size, price, total_nr);
    }

    @Override
    public String toString() {
        return  "Name= "+name + ' ' +
                "Material= "+ material + ' '+
                "Color= " + color + ' ' +
                "Size= " + size + ' '+
                "Price= " + price + ' ' +
                "Total number= " + total_nr;
    }
}
