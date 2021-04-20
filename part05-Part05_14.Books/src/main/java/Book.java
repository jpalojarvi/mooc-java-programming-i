
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
    public boolean equals(Object comparedObject){ // let's create a method once again, that compares objects. If the object values are the same, they are equal in our eyes; we don't care about the memory address here
        if (this == comparedObject){ // if they have equal values AND the same memory address, they are absolutely equal. This is the integrated Java implementation of equals()
            return true;
        }
        // ^ Is the simplified same version of: return (this == comparedPerson);
        
        // convert the Object-type Object comparedBook into a Book-type Object so that their values may be compared, as that is the thing we are mostly interested in
        Book comparedBook = (Book) comparedObject;
        
        // now for the interesting part. If the values of the Book-objects' values are equal, then the Book-objects are equal enough for our purposes. Memory address location and object name
        // is irrelevant to us here in this exercise
        if (this.name.equals(comparedBook.name)
                && (this.publicationYear == comparedBook.publicationYear)) {
            return true;
        }
        return false;
    }

}
