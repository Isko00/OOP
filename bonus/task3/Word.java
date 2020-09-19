package oop.bonus.task3;

import oop.bonus.task3.CharacterNeibors;

public class Word {
    private static CharacterNeibors[] adjacentKeys = new CharacterNeibors[127];

    {
        adjacentKeys[(int) 'q'] = new CharacterNeibors();
        adjacentKeys[(int) 'q'].set((int)'a');
        adjacentKeys[(int) 'q'].set((int)'w');
        adjacentKeys[(int) 'q'].set((int)'s');
        adjacentKeys[(int) 'w'] = new CharacterNeibors();
        adjacentKeys[(int) 'w'].set((int)'q');
        adjacentKeys[(int) 'w'].set((int)'a');
        adjacentKeys[(int) 'w'].set((int)'s');
        adjacentKeys[(int) 'w'].set((int)'d');
        adjacentKeys[(int) 'w'].set((int)'e');
        adjacentKeys[(int) 'e'] = new CharacterNeibors();
        adjacentKeys[(int) 'e'].set((int)'w');
        adjacentKeys[(int) 'e'].set((int)'s');
        adjacentKeys[(int) 'e'].set((int)'d');
        adjacentKeys[(int) 'e'].set((int)'f');
        adjacentKeys[(int) 'e'].set((int)'r'); 
        adjacentKeys[(int) 'r'] = new CharacterNeibors();
        adjacentKeys[(int) 'r'].set((int)'e');
        adjacentKeys[(int) 'r'].set((int)'d');
        adjacentKeys[(int) 'r'].set((int)'f');
        adjacentKeys[(int) 'r'].set((int)'g');
        adjacentKeys[(int) 'r'].set((int)'t'); 
        adjacentKeys[(int) 't'] = new CharacterNeibors();
        adjacentKeys[(int) 't'].set((int)'r');
        adjacentKeys[(int) 't'].set((int)'f');
        adjacentKeys[(int) 't'].set((int)'g');
        adjacentKeys[(int) 't'].set((int)'h');
        adjacentKeys[(int) 't'].set((int)'y'); 
        adjacentKeys[(int) 'y'] = new CharacterNeibors();
        adjacentKeys[(int) 'y'].set((int)'t');
        adjacentKeys[(int) 'y'].set((int)'g');
        adjacentKeys[(int) 'y'].set((int)'h');
        adjacentKeys[(int) 'y'].set((int)'j');
        adjacentKeys[(int) 'y'].set((int)'u'); 
        adjacentKeys[(int) 'u'] = new CharacterNeibors();
        adjacentKeys[(int) 'u'].set((int)'y');
        adjacentKeys[(int) 'u'].set((int)'h');
        adjacentKeys[(int) 'u'].set((int)'j');
        adjacentKeys[(int) 'u'].set((int)'k');
        adjacentKeys[(int) 'u'].set((int)'i'); 
        adjacentKeys[(int) 'i'] = new CharacterNeibors();
        adjacentKeys[(int) 'i'].set((int)'l');
        adjacentKeys[(int) 'i'].set((int)'u');
        adjacentKeys[(int) 'i'].set((int)'j');
        adjacentKeys[(int) 'i'].set((int)'k');
        adjacentKeys[(int) 'i'].set((int)'o'); 
        adjacentKeys[(int) 'o'] = new CharacterNeibors();
        adjacentKeys[(int) 'o'].set((int)'i');
        adjacentKeys[(int) 'o'].set((int)'k');
        adjacentKeys[(int) 'o'].set((int)'l');
        adjacentKeys[(int) 'o'].set((int)'p'); 
        adjacentKeys[(int) 'p'] = new CharacterNeibors();
        adjacentKeys[(int) 'p'].set((int)'o');
        adjacentKeys[(int) 'p'].set((int)'l');
        adjacentKeys[(int) 'a'] = new CharacterNeibors();
        adjacentKeys[(int) 'a'].set((int)'q');
        adjacentKeys[(int) 'a'].set((int)'w');
        adjacentKeys[(int) 'a'].set((int)'s');
        adjacentKeys[(int) 'a'].set((int)'x');
        adjacentKeys[(int) 'a'].set((int)'z');  
        adjacentKeys[(int) 's'] = new CharacterNeibors();
        adjacentKeys[(int) 's'].set((int)'w');
        adjacentKeys[(int) 's'].set((int)'q');
        adjacentKeys[(int) 's'].set((int)'a');
        adjacentKeys[(int) 's'].set((int)'z');
        adjacentKeys[(int) 's'].set((int)'x');  
        adjacentKeys[(int) 's'].set((int)'d');
        adjacentKeys[(int) 's'].set((int)'e');
        adjacentKeys[(int) 'd'] = new CharacterNeibors();
        adjacentKeys[(int) 'd'].set((int)'e');
        adjacentKeys[(int) 'd'].set((int)'w');
        adjacentKeys[(int) 'd'].set((int)'s');
        adjacentKeys[(int) 'd'].set((int)'x');
        adjacentKeys[(int) 'd'].set((int)'c');
        adjacentKeys[(int) 'd'].set((int)'v');  
        adjacentKeys[(int) 'd'].set((int)'f');
        adjacentKeys[(int) 'd'].set((int)'r');
        adjacentKeys[(int) 'f'] = new CharacterNeibors();
        adjacentKeys[(int) 'f'].set((int)'r');
        adjacentKeys[(int) 'f'].set((int)'e');
        adjacentKeys[(int) 'f'].set((int)'d');
        adjacentKeys[(int) 'f'].set((int)'c');
        adjacentKeys[(int) 'f'].set((int)'v');  
        adjacentKeys[(int) 'f'].set((int)'b');  
        adjacentKeys[(int) 'f'].set((int)'g');
        adjacentKeys[(int) 'f'].set((int)'t');
        adjacentKeys[(int) 'g'] = new CharacterNeibors();
        adjacentKeys[(int) 'g'].set((int)'t');
        adjacentKeys[(int) 'g'].set((int)'r');
        adjacentKeys[(int) 'g'].set((int)'f');
        adjacentKeys[(int) 'g'].set((int)'v');
        adjacentKeys[(int) 'g'].set((int)'b');  
        adjacentKeys[(int) 'g'].set((int)'n');
        adjacentKeys[(int) 'g'].set((int)'h');
        adjacentKeys[(int) 'g'].set((int)'y');
        adjacentKeys[(int) 'h'] = new CharacterNeibors();
        adjacentKeys[(int) 'h'].set((int)'y');
        adjacentKeys[(int) 'h'].set((int)'t');
        adjacentKeys[(int) 'h'].set((int)'g');
        adjacentKeys[(int) 'h'].set((int)'b');
        adjacentKeys[(int) 'h'].set((int)'n');  
        adjacentKeys[(int) 'h'].set((int)'m');
        adjacentKeys[(int) 'h'].set((int)'j');
        adjacentKeys[(int) 'h'].set((int)'u');
        adjacentKeys[(int) 'j'] = new CharacterNeibors();
        adjacentKeys[(int) 'j'].set((int)'u');
        adjacentKeys[(int) 'j'].set((int)'y');
        adjacentKeys[(int) 'j'].set((int)'h');
        adjacentKeys[(int) 'j'].set((int)'n');  
        adjacentKeys[(int) 'j'].set((int)'m');
        adjacentKeys[(int) 'j'].set((int)'k');
        adjacentKeys[(int) 'j'].set((int)'i');
        adjacentKeys[(int) 'k'] = new CharacterNeibors();
        adjacentKeys[(int) 'k'].set((int)'i');
        adjacentKeys[(int) 'k'].set((int)'u');
        adjacentKeys[(int) 'k'].set((int)'j');
        adjacentKeys[(int) 'k'].set((int)'m');  
        adjacentKeys[(int) 'k'].set((int)'l');
        adjacentKeys[(int) 'k'].set((int)'o');
        adjacentKeys[(int) 'l'] = new CharacterNeibors();
        adjacentKeys[(int) 'l'].set((int)'o');
        adjacentKeys[(int) 'l'].set((int)'i');
        adjacentKeys[(int) 'l'].set((int)'k');
        adjacentKeys[(int) 'l'].set((int)'m');
        adjacentKeys[(int) 'l'].set((int)'p'); 
        adjacentKeys[(int) 'm'] = new CharacterNeibors();
        adjacentKeys[(int) 'm'].set((int)'n');
        adjacentKeys[(int) 'm'].set((int)'h');
        adjacentKeys[(int) 'm'].set((int)'j');
        adjacentKeys[(int) 'm'].set((int)'k');
        adjacentKeys[(int) 'm'].set((int)'l'); 
        adjacentKeys[(int) 'n'] = new CharacterNeibors();
        adjacentKeys[(int) 'n'].set((int)'b');
        adjacentKeys[(int) 'n'].set((int)'g');
        adjacentKeys[(int) 'n'].set((int)'h');
        adjacentKeys[(int) 'n'].set((int)'j');
        adjacentKeys[(int) 'n'].set((int)'m'); 
        adjacentKeys[(int) 'b'] = new CharacterNeibors();
        adjacentKeys[(int) 'b'].set((int)'v');
        adjacentKeys[(int) 'b'].set((int)'f');
        adjacentKeys[(int) 'b'].set((int)'g');
        adjacentKeys[(int) 'b'].set((int)'h');
        adjacentKeys[(int) 'b'].set((int)'n'); 
        adjacentKeys[(int) 'v'] = new CharacterNeibors();
        adjacentKeys[(int) 'v'].set((int)'c');
        adjacentKeys[(int) 'v'].set((int)'d');
        adjacentKeys[(int) 'v'].set((int)'f');
        adjacentKeys[(int) 'v'].set((int)'g');
        adjacentKeys[(int) 'v'].set((int)'b'); 
        adjacentKeys[(int) 'c'] = new CharacterNeibors();
        adjacentKeys[(int) 'c'].set((int)'x');
        adjacentKeys[(int) 'c'].set((int)'s');
        adjacentKeys[(int) 'c'].set((int)'d');
        adjacentKeys[(int) 'c'].set((int)'f');
        adjacentKeys[(int) 'c'].set((int)'v'); 
        adjacentKeys[(int) 'x'] = new CharacterNeibors();
        adjacentKeys[(int) 'x'].set((int)'z');
        adjacentKeys[(int) 'x'].set((int)'a');
        adjacentKeys[(int) 'x'].set((int)'s');
        adjacentKeys[(int) 'x'].set((int)'d');
        adjacentKeys[(int) 'x'].set((int)'c');  
        adjacentKeys[(int) 'z'] = new CharacterNeibors();
        adjacentKeys[(int) 'z'].set((int)'s');
        adjacentKeys[(int) 'z'].set((int)'a');
        adjacentKeys[(int) 'z'].set((int)'x');
        adjacentKeys[(int) 'z'].set((int)'d');  
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
            answer = (adjacentKeys[(int) x].get((int) y)) ? 1 : 2;
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
                // if (i > 0 && j > 0) {
                //     System.out.println(s1.charAt(i - 1) + " " + s2.charAt(j - 1));
                // }
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
        return (distance(s1, s2) <= 2) /*&& samePartOfSpeach(s1, s2))*/;
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