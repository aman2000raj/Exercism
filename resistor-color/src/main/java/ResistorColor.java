class ResistorColor {
    String[] colorName = {
            "black",
            "brown",
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "violet",
            "grey",
            "white"
    };
    int colorCode(String color) {
        for (int i = 0; i < colorName.length; i++) {
            if (colorName[i].equals(color)) {
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return colorName.clone();
    }
}
