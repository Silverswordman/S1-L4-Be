package Es1;

public class Dipendente {
    public static double stipendioBase = 1000;
    public  int matricola ;
    private  double stipendio;
    private  double importoOrarioStraordinario;


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

    private  Livello livello;
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
                        ", dipartimento= " + dipartimento  + " importo orario straordinario " +
                        importoOrarioStraordinario + " stipendio " + stipendio+
        '}';
    }

//    public String promuoviDipendente() {
//
//        switch (Livello) {};
//    };

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
