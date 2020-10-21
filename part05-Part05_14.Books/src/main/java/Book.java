
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if(!(obj instanceof Book)) {
            return false;
        }
        Book compObj = (Book) obj;
        if (name.equals(compObj.name) && publicationYear == compObj.publicationYear) {
            return true;
        } else {
            return false;
        }
    }
}
