import java.util.Iterator;

public class IterableString implements Iterable <Character> {
    private String str;

    public IterableString(String str){
        this.str = str;
    }

    public Iterator<Character> iterator(){
        return new Iterator<Character>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < str.length();
            }

            @Override
            public Character next() {
                return str.charAt(currentIndex++);
            }
        };
    }
}
