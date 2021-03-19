public class Main {
    public static void main(String[] args) {
        Button b1 = new Button(new MyHandler1());
        Button b2 = new Button(new MyHandler2());
        b1.click();
        b2.click();
    }   
}
