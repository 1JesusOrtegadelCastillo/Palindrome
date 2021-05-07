package logica;

public class Palindromes {

    private String phrase;

    public Palindromes(String phrase){
        this.phrase = phrase;
    }

    public void isOrNot(){
        phrase = phrase.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("i", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace(" ", "")
                .replace("^[A-Za-z0-9]", "");

        int x = 0,
            y = phrase.length() - 1;

        while(x < y){
            if (phrase.charAt(x) != phrase.charAt(y)){
                System.out.println("false");
                System.exit(0);
            }
            x++;
            y--;

        }
        System.out.println("true");

    }
}
