import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico {
    private List<String> agenda;
    private List<String> historicoChamadas;

    public AparelhoTelefonico() {
        this.agenda = new ArrayList<String>();
        this.historicoChamadas = new ArrayList<String>();;
    }

    public void fazerLigacao(String numero) {
        System.out.println("ligando para "+ numero);
    }

    public void atenderLigacao() {
    }

    public void desligarChamada() {

    }

    public List<String> getAgenda() {
        return agenda;
    }

    public List<String> getHistoricoChamadas() {
        return historicoChamadas;
    }
}
