package com.example.stringBuilder;

public class StringVsStringBuilder {
    public static final int NUMBERS = 1_000_000;

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        slow();
        System.out.println("Slow method elapsed: " + (System.currentTimeMillis() - now) + "ms");

        now = System.currentTimeMillis();
        fast();
        System.out.println("Fast method elapsed: " + (System.currentTimeMillis() - now) + "ms");
    }


    private static void slow() {
        String s = "";
        for (int i = 0; i< NUMBERS; i++) {
            s += "*";
        }
    }

    private static void fast() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< NUMBERS; i++) {
            sb.append("*");
        }
    }

}
