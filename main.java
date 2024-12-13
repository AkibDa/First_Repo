import java.util.ArrayList;

class Array_sort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> multi = new ArrayList<Integer>();

        numbers.add(50);
        numbers.add(12);
        numbers.add(9);
        numbers.add(144);
        numbers.add(44);

        numbers.forEach(number -> {
            multi.add(number * 2);
            System.out.println(multi.toString());
        });

        System.out.println(numbers.toString());
    }
}