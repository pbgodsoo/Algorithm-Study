import java.util.HashMap;
import java.util.Map;

class Solution {
    class TrieNode {
        Map<Character, TrieNode> childNodes = new HashMap<>();
        boolean isLast = false;
    }
    TrieNode root = new TrieNode();
    
    boolean solution(String[] phone_book) {
        for (String word : phone_book) {
            if (!insert(word)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
         
            if (current.isLast) {
                return false;
            }
           
            if (current.childNodes.containsKey(c)) {
                current = current.childNodes.get(c);
            }
            else {
                TrieNode newNode = new TrieNode();
                current.childNodes.put(c, newNode);
                current = newNode;
            }
        }
        if (!current.childNodes.isEmpty()) {
            return false;
        }
        current.isLast = true;
        return true;
    }
}
