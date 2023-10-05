public class App {
    public static void main(String... args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoy = new Author("Лев" ,"Толстой");
        System.out.println("Сравнение авторов методом Equals = "+pushkin.equals(tolstoy));

        Book ruslanAndLudmila = new Book("Руслан и Людмила,", pushkin , 1826);
        Book warAndPeace = new Book("Война и Мир,", tolstoy, 1869);
        System.out.println("Сравнение произведений методом Equals = "+ruslanAndLudmila.equals(warAndPeace));

        printDate(ruslanAndLudmila);
        printDate(warAndPeace);
    }
    private static void printDate(Book book) {
        System.out.println("Вывод названия книги: " + book);
        System.out.println("Вывод хэш кода книги: " + book.hashCode());
    }


}


