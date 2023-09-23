public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private NavegadorInternet navegadorInternet;
    private AparelhoTelefonico aparelhoTelefonico;

    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.navegadorInternet = new NavegadorInternet();
        this.aparelhoTelefonico = new AparelhoTelefonico();
    }

    public void tocarMusica(String musica) {
        this.reprodutorMusical.tocarMusica(musica);
    };

    public void fazerLigacao(String numero) {
        this.aparelhoTelefonico.fazerLigacao(numero);
    };

    public void abrirNavegador() {
        this.navegadorInternet.navegarPara("https://matheusg.vercel.app/");
    };

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public static void main(String[] args) {
        var iphone = new Iphone();
        iphone.reprodutorMusical.tocarMusica("U2 - With or without you");        
        iphone.reprodutorMusical.getMusicaAtual();
        
        iphone.aparelhoTelefonico.fazerLigacao("219999-1234");
        iphone.abrirNavegador();
        iphone.navegadorInternet.getUrlAtual();

        iphone.navegadorInternet.navegarPara("www.youtube.com");
        iphone.navegadorInternet.getUrlAtual();
    }
}
