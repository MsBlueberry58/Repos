import java.util.*;

public class TestandoIterator {
    public static void main(String[] args) {

        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");

        Iterator<String> iterator = letras.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
