package main.domain;

import java.util.Objects;
import java.util.UUID;

public class ClothingItem {
    private final String id;    // Уникальный идентификатор товара, final- потому что id не меняется после создания.
    private String name;  // Название товара
    private String size;  // Размер например: "S", "M","L", "XL"
    private String color;
    private String category;
    private double price;

    public ClothingItem( String name,String size,String color,String category,double price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.size = size;
        this.color = color;
        this.category = category;
        this.price = price;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "category='" + category + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object object){
        // Если это один и тот же объект в памяти - то они равны
        if(this == object) return true;
        // Если объект null или не является экземпляром ClothingItem - они не равны
        if(object == null || getClass() != object.getClass()) return false;
        // Приводим
        ClothingItem tempClothingItem = (ClothingItem) object;
        return Objects.equals(id,tempClothingItem.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
