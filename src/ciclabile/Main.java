package ciclabile;

public class Main {
    public static void main(String[] args) {
        // Creazione di un array di interi
        int[] numeri = {1, 2, 3, 4, 5};

        // Creazione di un'istanza della classe ElencoInteri con l'array passato nel costruttore
        ElencoInteri elenco = new ElencoInteri(numeri);

        // Esecuzione dei metodi getElementoSuccessivo e hasAncoraElementi
        while (elenco.hasAncoraElementi()) {
            System.out.println("Prossimo elemento: " + elenco.getElementoSuccessivo());
        }

        // Verifica con il costruttore senza parametri e l'aggiunta di nuovi elementi
        ElencoInteri elencoVuoto = new ElencoInteri();
        elencoVuoto.addElemento(10);
        elencoVuoto.addElemento(20);
        elencoVuoto.addElemento(30);

        System.out.println("---- Nuovo elenco creato e popolato ----");
        
        while (elencoVuoto.hasAncoraElementi()) {
            System.out.println("Prossimo elemento: " + elencoVuoto.getElementoSuccessivo());
        }
    }
}
