package articles02Ex;

public class Article {
    //характеристики -> полета
    private String title;
    private String content;
    private String author;

    //конструктор -> създаваме обекти
    public Article (String title, String content, String author) {
        //нов празен обект
        //title = null
        //content = null
        //author = null
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //функционалности -> методи
    public void edit (String newContent) {
        this.content = newContent;
    }

    public void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    public void rename (String newTitle) {
        this.title = newTitle;
    }

    //default toString -> "{package}:{class}@{address}"
    @Override //пренаписвам -> работи по мой избор
    public String toString() {
        //"{title} - {content}:{author}"
        return this.title + " - " + this.content + ": " + this.author;
    }
}