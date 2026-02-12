package com.dsa.inter.ril;

import java.util.Objects;

public class CustomHashMap<K, V> {

    static class Node<K, V> {
        final K key;
        V val;
        Node<K, V> next;

        Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public String toString() {
            return key.toString();
        }
    }
    private Node<K, V>[] table;
    private int size;
    private int capacity;
    private final float loadFactor;

    private static final int DEFAULT_CAPACITY = 5;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    public CustomHashMap() {
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        this.capacity = DEFAULT_CAPACITY;
        this.table = new Node[this.capacity];
    }

    private int findIndex(K key) {
        int hash = key == null ? 0 : key.hashCode();
        return Math.abs(hash) % capacity;
    }

    public void put(K key, V val) {
        if (size >= capacity * loadFactor) {
            resizeMap();
        }
        int index = findIndex(key);
        Node<K, V> current = table[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                current.val = val;
                return;
            }
            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, val);
        table[index] = newNode;
        size++;
    }

    public V get(K key) {
        int index = findIndex(key);
        Node<K, V> current = table[index];
        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return current.val;
            }
            current = current.next;
        }
        return null;
    }

    private void resizeMap() {
        capacity *= 2;

        Node<K, V>[] oldNodes = table;
        table = new Node[capacity];
        size = 0;

        for (Node<K, V> head: oldNodes) {
            while (head != null) {
                put(head.key, head.val);
                head = head.next;
            }
        }
    }

    public int size() {
        return size;
    }

}