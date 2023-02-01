package pro.sky.java.course1.lesson12;

import java.util.Objects;

public class Author {
    private final String name;
    private final  String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public String toString (){
        return "Имя автора- " + name + " " + surname;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name)
                && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
            return Objects.hash(this.name,this.surname);
    }



}
