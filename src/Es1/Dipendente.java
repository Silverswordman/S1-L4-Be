package Es1;

public class Dipendente {
    public static double stipendioBase = 1000;
    public int matricola;
    private double stipendio;
    private double importoOrarioStraordinario;


    public static enum Livello {
        OPERAIO,
        IMPIEGATO,
        QUADRO,
        DIRIGENTE,
    }

    public static enum Dipartimento {
        PRODUZIONE,
        AMMINISTRAZIONE,
        VENDITE,
    }

    private Livello livello;
    private Dipartimento dipartimento;
    //costruttore

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
        this.dipartimento = dipartimento;
    }


    @Override
    public String toString() {
        return
                "Dipendente{" + "Matricola " + matricola + " Dipartimento " + dipartimento +
                        " livello= " + livello +
                        ", dipartimento= " + dipartimento + " importo orario straordinario " +
                        importoOrarioStraordinario + " stipendio " + stipendio +
                        '}';
    }

    public void promuoviDipendente() {

        switch (this.livello) {
            case OPERAIO -> {

                this.livello = Livello.IMPIEGATO;

                this.stipendio = (stipendioBase) * 1.2;
            }
            case IMPIEGATO -> {
                this.livello = Livello.QUADRO;
                this.stipendio = (stipendioBase) * 1.5;

            }
            case QUADRO -> {
                this.livello = Livello.QUADRO;
                this.stipendio = (stipendioBase) * 2;
            }

            case DIRIGENTE -> {
                this.livello = Livello.DIRIGENTE;


                System.out.println(" Errore");
            }
        }

    }

    ;;

    public Dipendente(int matricola, Dipartimento dipartimento, double stipendioBase,
                      double stipendio,
                      double importoOrarioStraordinario, Livello livello) {

        this.matricola = matricola;
        this.stipendio = stipendio;
        this.stipendioBase = stipendioBase;
        this.dipartimento = dipartimento;
        this.livello = livello;
        this.importoOrarioStraordinario = importoOrarioStraordinario;


    }

    //


    //metodi getter
    public double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }
}
