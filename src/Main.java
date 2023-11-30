import Es1.Dipendente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Dipendente Luigi = new Dipendente(55, Dipendente.Dipartimento.PRODUZIONE, 1000, 1500, 30.5, Dipendente.Livello.OPERAIO);
        Dipendente Mario = new Dipendente(44, Dipendente.Dipartimento.AMMINISTRAZIONE, 2000, 2500, 12.5, Dipendente.Livello.QUADRO);
        Dipendente Bowser = new Dipendente(2, Dipendente.Dipartimento.VENDITE, 4000, 4500, 2.5, Dipendente.Livello.DIRIGENTE);
        System.out.println(Luigi.toString());
        System.out.println(Mario.toString());
        System.out.println(Bowser.toString());

        Bowser.promuoviDipendente();
        Luigi.promuoviDipendente();
        System.out.println(Luigi.toString());

//
    }
}
