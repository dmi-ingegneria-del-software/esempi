public class Button {
    Handler myh;

    public Button(Handler h) {
        myh = h;
    }

    public void click() {
        myh.gestisci("click bottone");
    }
}