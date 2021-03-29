import java.util.List;

public class EserciziFilter {

    // Conta tutti gli elementi non vuoti (lunghezza > zero)
    public long es0(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty())
                .count();
    }

    // Conta tutte le occorrenze di "Franco"
    public long es1(List<String> list) {
        return 0;
    }

    // Conta tutti gli elementi con suffisso "no"
    // usare il metodo endsWith(suffix) di String
    public long es2(List<String> list) {
        return 0;
    }

    // Conta tutti gli elementi con suffisso "no" lunghe almeno 5 caratteri
    public long es3(List<String> list) {
        return 0;
    }

    // Conta tutte gli elementi con prefisso "sa" (indipendentemente da maiuscole e minuscole)
    // cerca un modo per rendere ininfluente la differenza tra maiuscole e minuscole
    public long es4(List<String> list) {
        return 0;
    }

    // Conta tutte gli elementi con prefisso "Sa" e suffisso "no"
    public long es5(List<String> list) {
        return 0;
    }

    // Conta tutte gli elementi con prefisso "Sa" oppure "Ti"
    public long es6(List<String> list) {
        return 0;
    }

    // Conta tutte gli elementi con prefisso "Sa" oppure "Ti" e suffisso "no"
    public long es7(List<String> list) {
        return 0;
    }

    // Conta tutti i valori divisibili o per 2 o per 5
    public long es8(List<Integer> list) {
        return 0;
    }

    // Conta tutti i valori divisibili sia per 2 che per 5
    public long es9(List<Integer> list) {
        return 0;
    }

}
