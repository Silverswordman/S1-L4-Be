import Es1.Dipendente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Dipendente Luigi = new Dipendente(55, Dipendente.Dipartimento.PRODUZIONE, 2000, 2000, 30.5, Dipendente.Livello.OPERAIO);
        Dipendente Mario = new Dipendente(44, Dipendente.Dipartimento.AMMINISTRAZIONE, 4000, 2500, 12.5, Dipendente.Livello.QUADRO);
        System.out.println(Luigi.toString());
        System.out.println(Mario.toString());
//
    }
}
