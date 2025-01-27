public class Main {
    public static void main(String[] args) {
        IssuedBook issuedBook = new IssuedBook();
        issuedBook.setBookId("004");
        issuedBook.setTitle("AI");
        issuedBook.setAuthor("Md. Ayon Mia");
        issuedBook.setIssuerName("Mehedi");
        issuedBook.setIssueDate("20/01/2025");
        issuedBook.displayBookDetails();
    }
}