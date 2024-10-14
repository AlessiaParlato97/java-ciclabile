package ciclabile;

public class ElencoInteri {
    private int[] elenco;      // array di interi
    private int indice;        // traccia l'indice corrente

    // Costruttore che prende un array di interi
    public ElencoInteri(int[] elenco) {
        this.elenco = elenco;
        this.indice = 0;  // inizializziamo l'indice a 0
    }

    // Costruttore senza parametri, inizializza l'array vuoto
    public ElencoInteri() {
        this.elenco = new int[0];
        this.indice = 0;
    }

    // Metodo per aggiungere un nuovo intero all'elenco
    public void addElemento(int nuovoElemento) {
        int[] nuovoElenco = new int[elenco.length + 1];
        System.arraycopy(elenco, 0, nuovoElenco, 0, elenco.length);
        nuovoElenco[elenco.length] = nuovoElemento;
        elenco = nuovoElenco;
    }

    // Metodo per ottenere il prossimo elemento
    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            return elenco[indice++];
        } else {
            throw new IllegalStateException("Non ci sono più elementi.");
        }
    }

    // Metodo per verificare se ci sono ancora elementi
    public boolean hasAncoraElementi() {
        return indice < elenco.length;
    }
}

