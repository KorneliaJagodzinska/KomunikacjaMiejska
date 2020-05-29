package zajezdnie;

import pojazdy.Pojazd;
import pojazdy.Tramwaj;

public class ZajezdniaTramwajowa extends Zajezdnia {

    public ZajezdniaTramwajowa(String nazwa) {
        super(nazwa);
    }

    @Override
    public String toString() {
        return super.toString() + ", sumaWagonow=" + sumaWagonow();
    }

    public int sumaWagonow() {
        int suma = 0;
        for (Pojazd pojazd : listaPojazdow) {
            Tramwaj temp = (Tramwaj) pojazd;
            suma += temp.getIloscWagonow().getLiczbaWagonow();
        }
        return suma;
    }
}
