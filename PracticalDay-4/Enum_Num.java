import java.util.*;

public class Enum_Num {
    enum Color {RED, GREEN, BLUE}

    public static void main(String[] args) {

        EnumSet<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN);
        System.out.println("Original enum set: " + enumSet);

        EnumSet<Color> complement = EnumSet.complementOf(enumSet);
        System.out.println("Complement of enum set: " + complement);

        EnumSet<Color> subset = EnumSet.copyOf(enumSet);
        System.out.println("Subset: " + subset);

        EnumSet<Color> superset = EnumSet.copyOf(complement);
        System.out.println("Superset: " + superset);

        EnumSet<Color> newEnumSet = EnumSet.noneOf(Color.class);
        newEnumSet.add(Color.RED);
        newEnumSet.add(Color.BLUE);
        System.out.println("New enum set: " + newEnumSet);

        Color[] array = newEnumSet.toArray(new Color[0]);
        System.out.println("Enum set as array: " + Arrays.toString(array));

    }
}
