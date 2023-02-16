import java.time.LocalDate;

public abstract class Educationcenter {
    private String name;
    private String locatedCountry;
    LocalDate founDationYear;

    public Educationcenter(String name, String locatedCountry, LocalDate founDationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.founDationYear = founDationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate getFounDationYear() {
        return founDationYear;
    }

    public void setFounDationYear(LocalDate founDationYear) {
        this.founDationYear = founDationYear;
    }

    @Override
    public String toString() {
        return "Educationcenter{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", founDationYear=" + founDationYear +
                '}';
    }
}
