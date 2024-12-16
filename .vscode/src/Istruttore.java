import java.util.HashMap;

public class Istruttore {
    private String nome;
    private String cognome;
    private String codiceIstruttore;
    private HashMap<String, Socio> soci;

    public Istruttore(String nome, String cognome, String codiceIstruttore) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceIstruttore = codiceIstruttore;
    }

    public boolean hasSocio(String codiceSocio) {
        return soci.containsKey(codiceSocio);
    }

    public void setSocio(Socio socio) {
        soci.put(socio.getCodiceSocio(), socio);
    }

    public void removeSocio(String s) {
        soci.remove(soci.get(s));
    }

    public String getSoci() {
        String retValue = "";
        for (Socio socio : soci.values()) {
            retValue += soci;
        }
        return retValue;
    }

}