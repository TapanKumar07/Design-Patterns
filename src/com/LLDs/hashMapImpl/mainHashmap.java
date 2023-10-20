package com.LLDs.hashMapImpl;

import com.sun.jdi.Value;

public class mainHashmap<K, V>{

    private static final int MIN_CAPACITY = (1 << 4);
    private static final int MAX_CAPACITY = (1 << 30);
    public int sz;

    public Entry[] hashMap;

    class Entry<K, V>{
        K key;
        V value;
        Entry next;
        Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public mainHashmap() {
        hashMap = new Entry[MIN_CAPACITY];
        sz = 16;
    }

    public mainHashmap(int capacity) {
        capacity = calCap(capacity);
        sz = capacity;
        hashMap = new Entry[capacity];
    }

    private int calCap(int capacity) {
        int n = capacity - 1;
        n |= (n >>> 1);
        n |= (n >>> 2);
        n |= (n >>> 4);
        n |= (n >>> 8);
        n |= (n >>> 16);

        return (n < 0 ? 1 : (n >= MAX_CAPACITY ? MAX_CAPACITY : n + 1));
    }

    public void put(K key, V value) {
        //cal hash
        int hash = key.hashCode() % sz;

        if(hashMap[hash] == null) {
            Entry<K, V> e = new Entry<>(key, value);
            hashMap[hash] = e;
        } else {
            Entry node = hashMap[hash], prev = null;
            while(node != null) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
                prev = node;
                node = node.next;
            }
            prev.next = new Entry<>(key, value);
        }
    }

    public V get(K key) {
        int hash = key.hashCode() % sz;
        Entry node = hashMap[hash];
        while(node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            }
            node = node.next;
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println("hi");

        mainHashmap<Integer, String> hm = new mainHashmap<>();
        hm.put(1, "Hello");
        hm.put(2, "Moley Moley");
        hm.put(3, "Blank");
        hm.put(4, "Dfeg e");

        System.out.println(hm.get(2));

        hm.put(1, "we live");
        System.out.println(hm.get(4));
        System.out.println(hm.get(1));
    }


}
