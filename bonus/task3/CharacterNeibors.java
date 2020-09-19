package oop.bonus.task3;

public class CharacterNeibors {
    private boolean[] arr;

    public CharacterNeibors() {
        arr = new boolean[127];
    }

    public boolean get(int index) {
        return arr[index];
    }

    public void set(int index) {
        arr[index] = true;
    }

    public void set(int index, boolean value) {
        arr[index] = value;
    }

    public String toString() {
        String answer = "";
        for (boolean i : arr) {
            answer += (i) ? "true" : "false" + ", ";
        }
        return answer;
    }
}