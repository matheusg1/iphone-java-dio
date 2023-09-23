public class NavegadorInternet {
    private String urlAnterior;
    private String urlAtual;
    private String proximaUrl;

    public void navegarPara(String url){
        setUrlAnterior(urlAtual);
        setUrlAtual(url);
    }
    public void avancar(){

    }
    public void voltar(){
        
    }
    public void atualizarPagina(){
        setUrlAtual(urlAtual);
    }

    public String getUrlAnterior() {
        System.out.println(urlAnterior);
        return urlAnterior;
    }
    public void setUrlAnterior(String urlAnterior) {
        this.urlAnterior = urlAnterior;
    }
    public String getUrlAtual() {
        System.out.println(urlAtual);
        return urlAtual;
    }
    public void setUrlAtual(String urlAtual) {
        this.urlAtual = urlAtual;
    }
    public String getProximaUrl() {
        System.out.println(proximaUrl);
        return proximaUrl;
    }
    public void setProximaUrl(String proximaUrl) {
        this.proximaUrl = proximaUrl;
    }
}