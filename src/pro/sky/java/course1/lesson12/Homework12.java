package pro.sky.java.course1.lesson12;
public class Homework12 {
    public static void main (String[] args) {
        Author bulgakov = new Author("Michael", "Bulgakov");
        Book theMasterAndMargarita = new Book("TheMasterAndMargarita",bulgakov,1966);
        Author shakespeare = new Author("William", "Shakespeare");
        Book hamlet = new Book("Hamlet",shakespeare,1903);
        theMasterAndMargarita.setPublicationYear(1967);
        Book hamlet2 = new Book("Hamlet",shakespeare,1903);
        System.out.println(hamlet.toString());
        System.out.println(hamlet.equals(hamlet2));
        System.out.println(hamlet.equals(bulgakov));
        System.out.println(hamlet.hashCode());
    }
}
