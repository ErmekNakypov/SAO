public class Main {
    public static void main(String[] args) {
        String s = "Ermek";
        s = reverse(s);
        System.out.println(s);
    }
    private static String reverse(String s) {
        if (s == null || s.isEmpty())
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}

