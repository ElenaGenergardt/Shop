package main.domain;

import java.util.Objects;

/*
Задание 1: Сущность "Пользователь" (User)
Цель: Добавить возможность регистрации и аутентификации пользователя (очень примитивно,
без реальной безопасности).

Что нужно сделать:

Создать класс User (в пакете domain):
Поля: String id, String username, String password (просто строка для демонстрации, без хеширования).
Конструктор, геттеры.
Переопределить equals(), hashCode(), toString().
 */
public class User {
    private String id;
    private String userName;
    private String password;

    public User(String id,String userName,String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;

    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(id, user.id) && Objects.equals(userName, user.userName) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
