package lesson4;

public class Prob2 {
    public static void main(String[] args) {
        String input = "reviore";
        System.out.println(findMinChar(input));
    }

    private static Character findMinChar(String s){
        char c = s.charAt(0);
        if (s.length() - 1 == 0){
            return c;
        }

        char minCharInRest = findMinChar(s.substring(1));

        return (c < minCharInRest ? c : minCharInRest);
    }
}
