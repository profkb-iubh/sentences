public class Sentence implements Comparable<Sentence> {
    private int length;
    private String text;

    public Sentence(String text) {
        this.text = text;
        this.length = text.length();
    }

    public int getLength() {
        return length;
    }

    public String getText() {
        return text;
    }

    @Override
    public int compareTo(Sentence obj) {
        /**
         * TODO: return 1 if the length of this sentence is larger than the length of
         * obj; return -1 one if smaller; return 0 if the same
         */
    }

}
