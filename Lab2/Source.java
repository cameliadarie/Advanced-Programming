/**
 * Aceasta clasa este abstracta si cu ajutorul ei definim sursele
 */
package Lab2;

import java.util.Objects;

public abstract class Source {
    public String nume;
    int capacity;

    public String getNume() {
        return nume;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Source(String nume, int capacity) {
        this.nume = nume;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Source{" +
                "nume='" + nume + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Source)) return false;
        Source source = (Source) o;
        return capacity == source.capacity && Objects.equals(nume, source.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, capacity);
    }
}
