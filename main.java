import java.util.ArrayList;
import java.util.Comparator;

class Array_sort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(50);
        numbers.add(12);
        numbers.add(9);
        numbers.add(144);
        numbers.add(44);

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString());
    }
}