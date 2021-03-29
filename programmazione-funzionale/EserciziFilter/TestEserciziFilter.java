import java.util.List;

public class TestEserciziFilter {
    EserciziFilter ef;

    private TestEserciziFilter() {
        this.ef = new EserciziFilter();
    }

    // Conta tutti gli elementi non vuoti (lunghezza > zero)
    private void testEs0() {
        List<String> list = List.of("Gino", "", "Franco", "", "Saturnino", "    ");
        expected("testEs0", ef.es0(list), 4);
    }

    // Conta tutte le occorrenze di "Franco"
    private void testEs1() {
        List<String> list = List.of("Gino", "Pino", "Franco", "Tino", "Saturnino", "Saro");
        expected("testEs1", ef.es1(list), 1);
    }

    // Conta tutti gli elementi con suffisso "no"
    private void testEs2() {
        List<String> list = List.of("Gino", "Pino", "Franco", "Tino", "Saturnino", "Saro");
        expected("testEs2", ef.es2(list), 4);
    }

    // Conta tutti gli elementi con suffisso "no" lunghe almeno 5 caratteri
    private void testEs3() {
        List<String> list = List.of("Gino", "Pino", "Franco", "Tino", "Saturnino", "Saro");
        expected("testEs3", ef.es3(list), 1);
    }

    // Conta tutte gli elementi con prefisso "sa" (indipendentemente da maiuscole e minuscole)
    private void testEs4() {
        List<String> list = List.of("Tino", "Saturnino", "saro", "saturnino", "SARO");
        expected("testEs4", ef.es4(list), 4);
    }

    // Conta tutte gli elementi con prefisso "Sa" e suffisso "no"
    private void testEs5() {
        List<String> list = List.of("Tino", "Saturnino", "saro", "saturnino", "SARO");
        expected("testEs5", ef.es5(list), 1);
    }

    // Conta tutte gli elementi con prefisso "Sa" oppure "Ti"
    private void testEs6() {
        List<String> list = List.of("Tino", "Saturnino", "Saro");
        expected("testEs6", ef.es6(list), 3);
    }

    // Conta tutte gli elementi con prefisso "Sa" oppure "Ti" e suffisso "no"
    private void testEs7() {
        List<String> list = List.of("Tino", "Saturnino", "Saro");
        expected("testEs7", ef.es7(list), 2);
    }

    // Conta tutti i valori divisibili per 2 o per 5
    private void testEs8() {
        List<Integer> list = List.of(1, 2, 5, 10);
        expected("testEs8", ef.es8(list), 3);
    }

    // Conta tutti i valori divisibili sia per 2 che per 5
    private void testEs9() {
        List<Integer> list = List.of(1, 2, 5, 10);
        expected("testEs9", ef.es9(list), 1);
    }

    private void expected(String testName, long actual, long expected) {
        System.out.println(" [*] " + testName + ": " 
            + (expected == actual ? "PASSED" : "\t\tFAILED"));
    }

    public static void main(String[] args) {
        var t = new TestEserciziFilter();

        t.testEs0();
        t.testEs1();
        t.testEs2();
        t.testEs3();
        t.testEs4();
        t.testEs5();
        t.testEs6();
        t.testEs7();
        t.testEs8();
        t.testEs9();

    }
    
}
