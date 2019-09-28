package question_5;//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class question_5 {
    public static void main(String[] args) {
        String str = "I like to travel to the most unusual places, aaa33a";
        int replaceAll = str.length() - str.replaceAll("a", "").length();
        System.out.println("The letter 'a' occurs "+ replaceAll+" times");;
    }
}