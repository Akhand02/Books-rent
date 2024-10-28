package dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.ISBN;

public class BooksDTO {
    @ISBN(type = ISBN.Type.ISBN_13, message = "ISBN number is not well formatted.")
    @NotEmpty(message = "Please provide proper ISBN number!!!")
    private String isbn;
    @Size(min = 10, max = 40, message = "Number of character should be between 10 to 40")
    @NotEmpty(message = "Please provide proper TITLE!!!")
    private String title;
    @Size(min = 10, max = 40, message = "Number of character should be between 10 to 40")
    @NotEmpty(message = "Please provide proper GENRE!!!")
    private String genre;
    @Size(min = 10, max = 100, message = "Number of character should be between 10 to 100")
    private String shortDescription;
    @Size(min = 101, max = 500, message = "Number of character should be between 101 to 500")
    private String longDescription;
    private String banner;
    @Min(value = 0, message = " Please provide valid number of copies!!!")
    private int numberOfCopies;
}
