public class Main {
    public static void main(String[] args) {
        Button b1 = new Button(e -> System.out.println("Gestito da handler1: " + e));
        Button b2 = new Button(e -> System.out.println("Gestito da handler2: " + e));
        b1.click();
        b2.click();
    }
}
