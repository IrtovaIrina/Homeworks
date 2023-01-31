package pro.sky.java.course1.lesson12;
public class Homework12 {
    public static void main (String[] args) {
        Author bulgakov = new Author("Michael", "Bulgakov");
        Book theMasterAndMargarita = new Book("theMasterAndMargarita",bulgakov,1966);
        Author shakespeare = new Author("William", "Shakespeare");
        Book hamlet = new Book("hamlet",shakespeare,1903);
        theMasterAndMargarita.setPublicationYear(1967);
    }
}
