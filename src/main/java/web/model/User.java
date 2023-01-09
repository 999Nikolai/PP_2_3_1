package web.model;




import javax.persistence.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id_")//, nullable = false
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_")
    @NotEmpty(message =  "Напишите имя")
    @Size(min = 2, max = 30, message = "Имя короткое или длинное")
    private String name;
    @Column(name = "age_", nullable = false)
    @Min(value = 0, message = "Возраст должен быть больше чем 0")
    public int age;

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
