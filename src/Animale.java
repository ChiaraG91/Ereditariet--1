public class Animale {

    public String nomeAnimale;

    public String verso;

    public Animale(String nomeAnimale, String verso){
        this.nomeAnimale = nomeAnimale;
        this.verso = verso;
    }

    public String getNomeAnimale() {
        return nomeAnimale;
    }

    public void setNomeAnimale(String nomeAnimale) {
        this.nomeAnimale = nomeAnimale;
    }

    public String getVerso() {
        return verso;
    }

    public void setVerso(String verso) {
        this.verso = verso;
    }

    public void faiIlVerso(String verso){
        System.out.println(this.verso);
    }
}
