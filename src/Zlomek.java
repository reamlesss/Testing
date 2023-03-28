/**
 * řída pro práci se zlomky
 * @author :D
 *
 */

public class Zlomek
{
    private int citatel;
    private int jmenovatel;

    public int getCitatel() {
        return citatel;
    }

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public void setJmenovatel(int jmenovatel) {
        if (jmenovatel == 0)
        {
            throw new ArithmeticException();
        }
        this.citatel = jmenovatel;
    }



    /**
     * Konstruktor vytvori zlomek se zadanou hodnotou citatele a jmenovatele
     * Prazdny konstrutor vytvori zlomek ve tvaru 1/1
     * @param citatel hodnota citatele
     * @param jmenovatel hodnota jmenovatele
     */
    public Zlomek(int citatel, int jmenovatel)
    {
        this.jmenovatel = jmenovatel;
        this.citatel = citatel;
    }

    /**
     * Metoda pro secteni dvou zlomku
     * @param a prvni zlomek
     * @param b druhy zlomek
     * @return vysledny soucet dvou zlomku
     */
    public static Zlomek scitani(Zlomek a, Zlomek b)
    {
        Zlomek z = new Zlomek(a.citatel*b.jmenovatel + b.citatel*a.jmenovatel,a.jmenovatel*b.jmenovatel);
        z.Kraceni();
        return z;
    }

    public static Zlomek odcitani(Zlomek a, Zlomek b)
    {
        Zlomek z = new Zlomek(a.citatel * b.jmenovatel - b.citatel * a.jmenovatel, a.jmenovatel * b.jmenovatel);
        z.Kraceni();
        return z;
    }

    public static Zlomek nasobeni(Zlomek a, Zlomek b)
    {
        Zlomek z = new Zlomek(a.citatel * b.citatel , a.jmenovatel * b.jmenovatel);
        z.Kraceni();
        return z;
    }

    public static Zlomek deleni(Zlomek a, Zlomek b)
    {
        Zlomek z = new Zlomek(a.citatel * b.jmenovatel, a.jmenovatel * b.citatel);
        z.Kraceni();
        return z;
    }


    public String ToString()
    {
        return citatel+"/"+jmenovatel;
    }


    public void Kraceni()
    {
        citatel /= NSD(citatel,jmenovatel);
        jmenovatel /= NSD(citatel,jmenovatel);
    }

    /**
     * Metoda vypocita nejvetsiho spolecneho delitele dvou celych cisel
     * @param a prvni cislo
     * @param b druhe cislo
     * @return nejvetsi spoledny delitel
     */
    public static int NSD(int a, int b)
    {
        int c;
        while (b != 0)
        {
            c = b;
            b = a % b;
            a = c;
        }
        return a;
    }
}
