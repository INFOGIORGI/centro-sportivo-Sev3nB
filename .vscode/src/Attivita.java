public class Attivita {
    private Socio socio;
    private Istruttore istruttore;
    private String data;
    private String orarioInizio;
    private String orarioFine;
    private String descrizione;
    
    public Attivita(Socio socio, Istruttore istruttore, String data, String orarioInizio, String orarioFine,
            String descrizione) {
        this.socio = socio;
        this.istruttore = istruttore;
        this.data = data;
        this.orarioInizio = orarioInizio;
        this.orarioFine = orarioFine;
        this.descrizione = descrizione;
    }

    public Socio getSocio() {
        return socio;
    }

    public Istruttore getIstruttore() {
        return istruttore;
    }

    public String getData() {
        return data;
    }

    public String getOrarioInizio() {
        return orarioInizio;
    }

    public String getOrarioFine() {
        return orarioFine;
    }

    public String getDescrizione() {
        return descrizione;
    }

    
    
}
