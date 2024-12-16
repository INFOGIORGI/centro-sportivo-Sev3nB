
import java.util.ArrayList;

import java.util.HashMap;

public class CentroSportivo {
    private HashMap<String, Socio> soci;
    private HashMap<String, Istruttore> istruttori;
    private ArrayList<Attivita> attivita;

    public CentroSportivo() {
        soci = new HashMap<>();
        istruttori = new HashMap<>();
        attivita = new ArrayList<>();

    }

    public boolean aggiungiSocio(String nome, String cognome, String codiceSocio) {
        if (!soci.containsKey(codiceSocio)) {
            Socio s = new Socio(nome, cognome, codiceSocio);
            soci.put(codiceSocio, s);
            return true;
        }
        return false;
    }

    public boolean rimuoviSocio(String codiceSocio) {
        if (soci.containsKey(codiceSocio)) {
            soci.remove(codiceSocio);
            return true;
        }
        return false;
    }

    public Socio getSocio(String codiceSocio) {
        return soci.get(codiceSocio);
    }

    public boolean aggiungiIstruttore(String nome, String cognome, String codiceIstruttore) {
        if (!istruttori.containsKey(codiceIstruttore)) {
            Istruttore i = new Istruttore(nome, cognome, codiceIstruttore);
            istruttori.put(codiceIstruttore, i);
            return true;
        }
        return false;
    }

    public boolean rimuoviIstruttore(String codiceIstruttore) {
        if (istruttori.containsKey(codiceIstruttore)) {
            istruttori.remove(codiceIstruttore);
            return true;
        }
        return false;
    }

    public Istruttore getIstruttore(String codiceIstruttore) {
        return istruttori.get(codiceIstruttore);
    }

    public boolean assegnaIstruttore(String codiceSocio, String codiceIstruttore) {
        if (istruttori.containsKey(codiceIstruttore) && soci.containsKey(codiceSocio)
                && !istruttori.get(codiceIstruttore).hasSocio(codiceSocio)) {
            Istruttore i = istruttori.get(codiceIstruttore);
            Socio s = soci.get(codiceSocio);
            i.setSocio(s);
            s.setIstruttore(i);
            return true;
        }
        return false;
    }

    public boolean rimuoviAssegnazione(String codiceSocio, String codiceIstruttore) {
        if (istruttori.containsKey(codiceIstruttore) && soci.containsKey(codiceSocio)
                && !istruttori.get(codiceIstruttore).hasSocio(codiceSocio)) {
            Istruttore i = istruttori.get(codiceIstruttore);
            Socio s = soci.get(codiceSocio);
            s.setIstruttore(null);
            i.removeSocio(codiceSocio);
            return true;

        }
        return false;
    }

    public String getSoci(String codiceIstruttore) {
        return istruttori.get(codiceIstruttore).getSoci();
    }

    public boolean aggiungiAttivita(String codiceSocio, String codiceIstruttore, String data, String orarioInizio,
            String orarioFine) {
        if (soci.get(codiceSocio).getIstruttore() == istruttori.get(codiceIstruttore)) {
            Attivita a = new Attivita(soci.get(codiceSocio), istruttori.get(codiceIstruttore), data, orarioInizio,
                    orarioFine, orarioFine);
            attivita.add(a);
            return true;
        }
        return false;
    }
}