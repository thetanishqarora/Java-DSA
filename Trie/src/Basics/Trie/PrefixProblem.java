package Basics.Trie;


import org.jetbrains.annotations.NotNull;

public class PrefixProblem {

    static class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
        int frequency = 1;
    }
    private static TrieNode root = new TrieNode();

    public static void insert(@NotNull String word){
        TrieNode current = root;
        for(char c : word.toCharArray()){
            if(current.children[c - 'a'] == null) current.children[c - 'a'] = new TrieNode();
            else current.children[c - 'a'].frequency++;
            current = current.children[c - 'a'];
        }
        current.isEnd = true;
    }

    public static void findPrefix(TrieNode root, String prefix){
        if(root == null) return;
        if(root.frequency == 1) {
            System.out.println(prefix);
            return;
        }
        for(int i = 0 ; i < root.children.length /*26*/; i++){
            if(root.children[i]!=null)
                findPrefix(root.children[i], prefix + (char)(i + 'a'));
        }
    }

    //create method to find the frequency at any node ??

    public static void main(String[] args) {
        String words[] = {"zebra","dog","duck","dove"};
        for(String word : words){
            insert(word);
        }
        root.frequency = -1;
        findPrefix(root, "");
    }
}
