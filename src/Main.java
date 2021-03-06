import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(final String[] args) {
        // write your code here
        final ArrayList<Boy> boys = new ArrayList<>() {{
            add(new Boy("Николай", 68));
            add(new Boy("Пётр", 53));
            add(new Boy("Василий", 25));
            add(new Boy("Михаил", 19));
            add(new Boy("Алексей", 6));
            add(new Boy("Николай", 86));
            add(new Boy("Пётр", 35));
            add(new Boy("Михаил", 111));
            add(new Boy("Алексей", 22));
            add(new Boy("Михаил", 1));
            add(new Boy("Яков", 30));
        }};

        Map<String, Long> result = new HashMap<>();

        boys.stream()
                .filter(x -> (x.getAge() > 17))
                .map(x -> x.getName())
                .distinct()
                .sorted()
                .limit(4)
                .forEach(x -> result.put(x, boys.stream().filter(b -> x.equals(b.getName())).count() - 1));

        System.out.println(result);
    }
}
