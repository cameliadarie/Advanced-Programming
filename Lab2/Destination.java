/**
 * Aceasta clasa contine detalii despre clasa destinatie
 */
package Lab2;

import java.util.Objects;

public class Destination {

    int commodities;
    String nume;

    public int getCommodities() {
        return commodities;
    }

    public void setCommodities(int commodities) {
        this.commodities = commodities;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Destination( String nume, int commodities) {
        this.commodities = commodities;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "commodities=" + commodities +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destination)) return false;
        Destination that = (Destination) o;
        return commodities == that.commodities && Objects.equals(nume, that.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commodities, nume);
    }
}
