import java.time.LocalDate;

public class School extends Educationcenter{
    public School(String name, String locatedCountry, LocalDate founDationYear) {
        super(name, locatedCountry, founDationYear);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
