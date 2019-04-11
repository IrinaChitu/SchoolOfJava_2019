package beans;

public class TransactionRepository {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "TransactionRepository{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
