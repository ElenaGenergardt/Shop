package main.domain;

import java.util.Objects;

/*
Задание 2: Сущность "Категория товара" (Category)
Цель: Позволить товарам относиться к определённым категориям (например, "Верхняя одежда",
"Нижняя одежда", "Обувь").

Что нужно сделать:

Создать класс Category (в пакете domain):
Поля: String id, String name.
Конструктор, геттеры, equals(), hashCode(), toString().
 */
public class Category {
    private String id;
    private String name;

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Category category = (Category) object;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
