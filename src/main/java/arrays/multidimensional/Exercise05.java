package arrays.multidimensional;

import java.util.Objects;

public class Exercise05 {

    public Box[] shallowCopy(Box[] boxes) {
        // TODO: Create a shallow copy of the array 'boxes' and return it from this method.
        Box[] copy = boxes.clone();
        return copy;
    }

    public Box[][] deepCopy(Box[][] boxes) {
        // TODO: Create a deep copy of the multidimensional array 'boxes' and return it from this method.
        Box[][] boxesCopy = new Box[boxes.length][];
        for (int i = 0; i < boxes.length; i++) {
//            boxesCopy[i] = new Box[boxes[i].length];
            for (int j = 0; j < boxes[i].length; j++) {
                boxesCopy[i][j] = boxes[i][j];
            }
        }
        return boxesCopy;
    }

    // Mutable container for an int value.
    public static class Box implements Cloneable {
        private int value;

        public Box(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Box box = (Box) o;
            return value == box.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

        @Override
        public Box clone() {
            try {
                Box clone = (Box) super.clone();
                clone.value = this.value;
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
