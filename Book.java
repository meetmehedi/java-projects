 class Book {
    private String bookId;
    private String title;
    private String author;

    public String getbookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
class IssuedBook extends Book{
    private String issuerName;
    private String issueDate;

    public String getIssuerName() {
        return issuerName;
    }
    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }
    public String getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
public void displayBookDetails(){
    System.out.println("Book Details: ");
    System.out.println("Id: "+getbookId());
    System.out.println("Title: "+getTitle());
    System.out.println("Author: "+getAuthor());
    System.out.println("Issuer Name: "+getIssuerName());
    System.out.println("Issue Date: "+getIssueDate());
}
}