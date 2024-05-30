package entity;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private Category categoryNum;
    private String characteristics;

    public Product(int id, String name, Category category, String producer, String characteristics) {
        this.id = id;
        this.categoryNum = category;
        this.name = name;
        this.characteristics = characteristics;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategoryNum() {
        return categoryNum;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name) && Objects.equals(categoryNum, product.categoryNum) && Objects.equals(characteristics, product.characteristics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, categoryNum, characteristics);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Product [id=").append(id)
                .append(", category=").append(categoryNum)
                .append(", name=").append(name)
                .append(", characteristics=").append(characteristics)
                .append("]");
        return builder.toString();
    }

}
