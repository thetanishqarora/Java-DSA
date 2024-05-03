package Basics.Trie;

import static Basics.Trie.FirstTrie.*;

public class WordBreakProblem {

    public static boolean wordBreak(String key){
        if(key.isEmpty()) return true;
        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0,i)) &&
            wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"i","like","sam","samsung","ice"};
        for(String word : words) {
            insert(word);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
