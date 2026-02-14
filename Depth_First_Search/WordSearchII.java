package Depth_First_Search;
import java.util.*;

public class WordSearchII {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }

    public static List<String> findWords(char[][] board, String[] words) {
        TrieNode root = buildTrie(words);
        List<String> result = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, result);
            }
        }
        return result;
    }

    private static void dfs(char[][] board, int i, int j,
                            TrieNode node, List<String> result) {

        char c = board[i][j];

        if (c == '#' || node.children[c - 'a'] == null)
            return;

        node = node.children[c - 'a'];

        if (node.word != null) {
            result.add(node.word);
            node.word = null;   // avoid duplicates
        }

        board[i][j] = '#';

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        for (int[] d : dirs) {
            int x = i + d[0];
            int y = j + d[1];

            if (x >= 0 && y >= 0 && x < board.length && y < board[0].length) {
                dfs(board, x, y, node, result);
            }
        }

        board[i][j] = c;
    }

    private static TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();

        for (String word : words) {
            TrieNode node = root;

            for (char c : word.toCharArray()) {
                int index = c - 'a';

                if (node.children[index] == null)
                    node.children[index] = new TrieNode();

                node = node.children[index];
            }
            node.word = word;
        }
        return root;
    }

    // --------- MAIN METHOD TO RUN ---------
    public static void main(String[] args) {

        char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };

        String[] words = {"oath","pea","eat","rain","hklf","hf"};

        List<String> result = findWords(board, words);

        System.out.println("Words Found: " + result);
    }
}
