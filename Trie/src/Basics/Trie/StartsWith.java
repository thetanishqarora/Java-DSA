package Basics.Trie;

public class StartsWith {

    public static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    private static TrieNode root = new TrieNode();

    public static void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }

    public static boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple","app","mango","man","woman"};
        for (String word : words) {
            insert(word);
        }
        String prefix = "app";
        System.out.println(startsWith(prefix));
    }
}
