public class Twofer {
    public String twofer(String name) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String template = "One for you, one for me.";

        return name == null ? template : "One for " + name + ", one for me.";
    }
}
