public class NullPattern {

    public static void main(String[] args){

        AbstractRezident rezident = RezidentCountry.getRezident("Alexandru");
        AbstractRezident rezident1 = RezidentCountry.getRezident("Bobita");
        AbstractRezident rezident2 = RezidentCountry.getRezident("Cristi");
        AbstractRezident rezident3 = RezidentCountry.getRezident("Mihai");

        System.out.println("Population");
        System.out.println(rezident.getName());
        System.out.println(rezident1.getName());
        System.out.println(rezident2.getName());
        System.out.println(rezident3.getName());
    }
}
