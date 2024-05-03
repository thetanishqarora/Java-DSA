package Basics.Trie;

import java.util.Arrays;

public class FirstTrie {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }
    private static TrieNode root = new TrieNode();

    public static void insert(String word){
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            if(curr.children[c - 'a'] == null){
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isEnd = true;
    }
    public static boolean search(String word){
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            if(curr.children[c - 'a'] != null){
                curr = curr.children[c - 'a'];
            } else return false;
        }
        return curr.isEnd;
    }
    public static void main(String[] args) {
        String[] words = {"the","a","there","their","any","thee"};
        for (String word : words) {
            insert(word);
        }
        System.out.println(search("their"));
        TrieNode curr = root;

    }
}
