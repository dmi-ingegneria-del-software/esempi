# Esercizi Filter
Sono presenti tre classi:
- `EserciziFilter` che contiene dei metodi in cui inserire il codice di ciascun esercizio
- `TestEserciziFilter` che contiene i test per valutare la correttezza degli esercizi svolti
- `SoluzioneEserciziFilter` che contiene la soluzione (implementazione) degli esercizi **-- verrà caricata in seguito --**

Per svolgere un esercizio, leggere il codice di test, con il relativo commento. 

```java
// Conta tutti gli elementi non vuoti (lunghezza > zero)
private void testEs0() {
    List<String> list = List.of("Gino", "", "Franco", "", "Saturnino", "    ");
    expected("testEs0", ef.es0(list), 4);
}
```

Questo è un esempio di esercizio svolto:

```java
// Conta tutti gli elementi non vuoti (lunghezza > zero)
public long es0(List<String> list) {
    return list.stream()
                .filter(s -> !s.isEmpty())
                .count();
    }
```

I test sono *autovalutanti*, ovvero verificano automaticamente se il risultato ottenuto chiamando il metodo di un esercizio corrisponde a quello atteso, fornendo come esito del test `PASSED` o `FAILED`.

Per lanciare i test e valutare la correttezza del risultato per gli esercizi svolti, eseguire il metodo `main` nella classe `TestEserciziFilter`.

```text
[*] testEs0: PASSED
[*] testEs1:           FAILED
[*] testEs2:           FAILED
[*] testEs3:           FAILED
[*] testEs4:           FAILED
[*] testEs5:           FAILED
[*] testEs6:           FAILED
[*] testEs7:           FAILED
[*] testEs8:           FAILED
[*] testEs9:           FAILED
```

Al momento solo il metodo `EserciziFilter.es0()` è implementato correttamente, gli altri sono da implementare (restituiscono tutti 0)

```java
// Conta tutte le occorrenze di "Franco"
public long es1(List<String> list) {
    return 0;
}
```

La classe con la soluzione degli esercizi verrà caricata successivamente.