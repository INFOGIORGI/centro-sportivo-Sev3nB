public class Socio {
    private String nome;
    private String cognome;
    private String codiceSocio;
    private Istruttore istruttore;

    public Socio(String nome, String cognome, String codiceSocio) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSocio = codiceSocio;
    }

    public void setIstruttore(Istruttore istruttore) {
        this.istruttore = istruttore;
    }

    public String getCodiceSocio() {
        return codiceSocio;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " " + codiceSocio;
    }

    public Istruttore getIstruttore() {
        return istruttore;
    }

}
