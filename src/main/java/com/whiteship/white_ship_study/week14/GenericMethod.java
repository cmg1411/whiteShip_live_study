package com.whiteship.white_ship_study.week14;

public class GenericMethod {

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static <K, V> boolean compare(Pair<K, V> m1, Pair<K, V> m2) {
        boolean keyCompare = m1.getKey().equals(m2.getKey());
        boolean valueCompare = m1.getValue().equals(m2.getValue());
        return keyCompare && valueCompare;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("한국", 1);
        Pair<String, Integer> p2 = new Pair<>("한국", 2);

        System.out.println(compare(p1, p2));
    }
}
