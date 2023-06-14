public class Main {
    public static void main(String[] args) {
        String str = "Losowa zmienna x x x .";
        
        
        String bezspacji = str.replaceAll(" ", "");
        
        System.out.println("Podstawowy łańcuch: " + str);
        System.out.println("Łańcuch bez spacji: " + bezspacji);
    }
}