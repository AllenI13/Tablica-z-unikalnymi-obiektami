import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Box {
    private int capacity;
    private String colour;
    private boolean full;

    public Box(int capacity, String colour, boolean full) {
        this.capacity = capacity;
        this.colour = colour;
        this.full = full;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return capacity == box.capacity &&
                full == box.full &&
                Objects.equals(colour, box.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, colour, full);
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFull() {
        return full;
    }
}
