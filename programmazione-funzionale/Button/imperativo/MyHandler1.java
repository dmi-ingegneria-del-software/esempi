public class MyHandler1 implements Handler {
    @Override
    public void gestisci(String evento) {
        System.out.println("Gestito da handler1: " + evento); 
    }
}
