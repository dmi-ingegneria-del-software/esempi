public class MyHandler2 implements Handler {
    @Override
    public void gestisci(String evento) {
        System.out.println("Gestito da handler2: " + evento); 
    }
}
