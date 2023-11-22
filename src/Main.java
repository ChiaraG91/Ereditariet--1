public class Main {

    public static void main(String[] args){

        Animale animale = new Animale("Cane", "Bau");
        Gatto gatto = new Gatto("Gatto Siamese","Miao");



        animale.faiIlVerso(animale.getVerso());
        gatto.faiIlVerso(gatto.getVerso());
    }



}
