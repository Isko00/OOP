package oop.bonus.task3;

import oop.bonus.task3.Pair;

public class Word {
    private static Pair[] adjacentKeys = new Pair[26];
    private char[][] arr = { 
        { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' },
          { 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' }, 
            { 'z', 'x', 'c', 'v', 'b', 'n', 'm'} };

    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                adjacentKeys[arr[i][j] - 'a'] = new Pair(i, j);
            }
        }
    }
    
    private static int min(int x, int y, int z) { 
        return min(min(x, y), z); 
    } 

    private static int min(int x, int y) { 
        return (x < y) ? x : y; 
    }

    private static int cost(char x, char y) {
        int answer = 0;
        try {
            answer = (adjacentKeys[(int) x - 'a'].isNeibor(
                    adjacentKeys[(int) y - 'a'])) ? 1 : 2;
        } catch(NullPointerException e) {
            System.out.println("Exception: "+ e.toString());
        }

        return answer;
    }

    public int distance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] arr = new int[m + 1][n + 1]; 

        for (int i = 0; i <= m; i++) { 
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    arr[i][j] = j;
                } else if (j == 0) {
                    arr[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1]; 
                } else {
                    arr[i][j] = min(arr[i][j - 1] + 1, 
                        arr[i - 1][j] + 1, arr[i - 1][j - 1] + 
                        cost(s1.charAt(i - 1), s2.charAt(j - 1)));
                }
            }
        }

        return arr[m][n];
    }

    public boolean similar(String s1, String s2) {
        return (distance(s1, s2) <= 2);
    }

    public static void main(String[] args) {
        Word w = new Word();
        String s1 = "cat";
        String s2 = "rat";
        String s3 = "chat";
        String s4 = "fat";

        System.out.println(w.distance(s1, s2));
        System.out.println(w.distance(s1, s3));
        System.out.println(w.distance(s1, s4));
    }
}