package oop.lab1;

import java.util.Scanner;
import java.util.Random;

class HumanInitializindException extends Exception {
    public String toString() {
        return "Human has to have name and citizenship!";
    }
}

public class Human {
    Random random = new Random();
    /* Просто представим что IQ не меняется всю жизнь.
     * Некоторые источники так и утверждают.
     * Мне лень придумывать другой пример.
     */
    private final int IQ;
    /* У кадого человека есть голова.
     * Человек - голова = тело.
     * Тело != человек.
     */ 
    public static final boolean HASHEAD = true;

    // Name и гражданство с первого взгляда не узнаешь.
    private String name, citizenship;
    // Но рост можно(но сложно).
    public int height;
    
    {
        // Предположим 0 IQ бывает.
        IQ = random.nextInt(200);
        // Предположим новорожденные 40~80 см в длину.
        height = 40 + random.nextInt(40);
    }

    Human() throws HumanInitializindException {
        throw new HumanInitializindException();
    }

    Human(String name, String citizenship) {
        this.name = name;
        this.citizenship = citizenship;
    }

    public int getIQ() { return IQ; }
    public String getName() { return name; }
    public String getCitizenship() { return citizenship; }

    public String toString() {
        return "Name:" + name 
                    + "\nCitizenship: " + citizenship
                    + "\nHeight: " + height
                    + "\nHas head: " + ((HASHEAD) ? "yes" : "no")
                    + "\nIQ: " + IQ;
    }

    public boolean mayBeEquals(Human smbd) {
        if (smbd.getName().equals(this.name)
                && smbd.getCitizenship().equals(this.citizenship)
                && smbd.height == this.height
                && smbd.getIQ() == this.IQ) { return true; }
        else { return false; }
    }

    // Хотел посложнее Еnum.
    enum DialogueAnswers {
        YES {
            public void answer() {
                System.out.println("Yes, of course.");
            }
        },
        SHORTER {
            public void answer() {
                System.out.println("Use a little bit shorter senses, please.");
            }
        },
        NO {
            public void answer() {
                System.out.println("No, sorry.");
            }
        };
        public abstract void answer();
    }

    public static void main(String[] args) {
        Human me = new Human("Islam", "Kazakhstan");
        Human someBuddy = new Human("German", "Russia");
        Scanner in = new Scanner(System.in);
        String message;
        DialogueAnswers myCase;
        
        // Типо пример использования static
        if (!Human.HASHEAD) { 
            System.out.println("WOW! Where you left your horse?"); 
        }

        if (me.mayBeEquals(someBuddy)) {
            System.out.println("Look complitly same!");
        } else {
            System.out.println("Every one is unique!");
        }

        System.out.println(me.toString()); 
        System.out.println(someBuddy.toString());

        for (int i = 0; i < 3; i++) {
            message = in.nextLine();
            
            if (message.length() > 6) {
                myCase = DialogueAnswers.SHORTER;
            } else if (message.equals("Ready?")) {
                myCase = DialogueAnswers.NO;
            } else {
                myCase = DialogueAnswers.YES;
            }

            myCase.answer();
        }
    }
}