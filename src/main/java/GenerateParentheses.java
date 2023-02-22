import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GenerateParentheses {
    public static List<String> generate(int n) {

        if(n == 1){
            return List.of("()");
        }

        List<String> strings = generate(n-1);
        Set<String> set = new HashSet<>();

        for(String string : strings) {
            set.add("(" + string + ")");
            set.add("()" + string);
            set.add(string + "()");
        }
        return set.stream().collect(Collectors.toList());
    }
}
