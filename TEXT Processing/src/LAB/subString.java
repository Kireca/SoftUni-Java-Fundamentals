package LAB;

public class subString {
    public static void main(String[] args) {


        // TODO Намиране на всички индекси по символ ...
        String text = "the quick brown fox jumps over the lazy dog";
        // TODO    Символ!
        char search = 't';
        int index = text.indexOf(search);
        while (index != -1) {

            System.out.println(index);
            index = text.indexOf(search, index + 1);
        }

        // TODO REMOVE WORD FROM STRING ! ! !


        String removeWord = "the ";

        int removeIndex = text.indexOf(removeWord);
        while (removeIndex != -1) {
            String firstRemove = text.substring(0, removeIndex);
            String secondRemove = text.substring(removeIndex + removeWord.length());
            text = firstRemove + secondRemove;

            removeIndex = text.indexOf(removeWord);
        }
        System.out.println(text);

    }
}
