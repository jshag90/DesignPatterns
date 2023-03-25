package com.ji.structural_patterns.flyweight.after;

public class Font {
    final String family;

    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getFamily() {
        return family;
    }
}
