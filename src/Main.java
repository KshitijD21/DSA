import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public class HashMapCode {
        static class MyHashMap<K,V> {

            private class Node {
                K key;
                V value;
                public Node(K key, V value) {
                    this.key = key;
                    this.value = value;
                }
            }

            private int n;
            private int N;
            private LinkedList<Node>[] buckets;

            public MyHashMap() {

                this.N = 4;
                this.buckets = new LinkedList[N];
                for (int i=0 ; i< N; i++){
                    buckets[i] = new LinkedList<>();
                }
            }

            private int findBucketIndex(K key) {
                int index = key.hashCode();
                return Math.abs(index) % N;
            }

            private int findSearchIndex(int bi, K key) {
                LinkedList<Node> search = buckets[bi];
                for (int i = 0; i<search.size(); i++) {
                    if (search.get(i).key.equals(key)) {
                        return i;
                    }
                }
                return -1;
            }

            private void rehash() {
                LinkedList<Node>[] oldLinkedList = buckets;
                buckets = new LinkedList[N*2];
                for (int i= 0; i< N*2; i++) {
                    buckets[i] = new LinkedList<>();
                }
                for (int i = 0; i< oldLinkedList.length; i++) {
                    LinkedList<Node> ll = oldLinkedList[i];
                    for (int j= 0; j< ll.size(); j++) {
                        Node node = ll.get(j);
                        put(node.key, node.value);
                    }
                }
            }

            public void put(K key, V value) {
                int bi = findBucketIndex(key);
                int si = findSearchIndex(bi, key);

                if (si == -1 ) {
                    buckets[bi].add(new Node(key, value));
                    n++;
                } else {
                    buckets[bi].get(si).value = value;
                }

                double lamda = (double) n/N;
                if (lamda == 2.0) {
                    rehash();
                }
            }

            public V get(K key){
                int bi = findBucketIndex(key);
                int si = findSearchIndex(bi, key);

                if (si == -1 ) {
                   return null;
                } else {
                    return buckets[bi].get(si).value;
                }
            }


            public boolean containsKey(K key) {
                int bi = findBucketIndex(key);
                int si = findSearchIndex(bi, key);

                if (si == -1 ) {
                    return false;
                } else {
                    return true;
                }
            }

            public V remove(K key) {
                int bi = findBucketIndex(key);
                int si = findSearchIndex(bi, key);

                if (si == -1 ) {
                    return null;
                } else {
                    V value =  buckets[bi].get(si).value;
                    buckets[bi].remove(si);
                    n--;
                    return value;
                }
            }

            public ArrayList<K> keySet() {
                ArrayList<K> keys = new ArrayList<>();
                for (int i = 0; i<buckets.length; i++) {
                    LinkedList<Node> ll = buckets[i];
                    for (int j=0; j< ll.size(); j++) {
                        Node node = ll.get(j);
                        keys.add(node.key);
                    }
                }
                return keys;
            }

            public boolean isEmpty() {
                return  n ==0;
            }
        }
    }



    public static void main(String[] args) {

        HashMapCode.MyHashMap<String, Integer> hashMap = new HashMapCode.MyHashMap<>();
        hashMap.put("India", 150);
        hashMap.put("USA", 100);
        hashMap.put("China", 200);
        hashMap.put("Maxico", 50);
        hashMap.put("India", 50);

        ArrayList<String> arrayList = hashMap.keySet();

        for (int i=0; i<arrayList.size(); i++) {
            System.out.println("key:: " + arrayList.get(i) + " value:: " + hashMap.get(arrayList.get(i)));
        }

        hashMap.remove("India");

        for (int i=0; i<arrayList.size(); i++) {
            System.out.println("key:: " + arrayList.get(i) + " value:: " + hashMap.get(arrayList.get(i)));
        }

    }
}