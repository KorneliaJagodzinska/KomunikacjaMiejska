import pojazdy.Autobus;
import pojazdy.IloscWagonow;
import pojazdy.Tramwaj;
import zajezdnie.Zajezdnia;
import zajezdnie.ZajezdniaAutobusowa;
import zajezdnie.ZajezdniaTramwajowa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Zajezdnia tramwajowa = new ZajezdniaTramwajowa("Zajezdnia tramwajowa 1");
        Zajezdnia autobusowa = new ZajezdniaAutobusowa("Zajezdnia autobusowa 1");

        Tramwaj tramwaj = new Tramwaj(60.5,2,tramwajowa, IloscWagonow.TRZY);
        Tramwaj tramwaj2 = new Tramwaj(60.5,2,tramwajowa, IloscWagonow.JEDEN);


        Autobus autobus = new Autobus(80.7, 127, autobusowa, 106);
        Autobus autobus2 = new Autobus(110.1, 123, autobusowa, 506);

        tramwajowa.setListaPojazdow(Arrays.asList(tramwaj,tramwaj2));
        autobusowa.setListaPojazdow(Arrays.asList(autobus,autobus2));


        System.out.println(tramwajowa);
        System.out.println(autobusowa);
        System.out.println();

        System.out.println(tramwaj);
        System.out.println(tramwaj2);
        System.out.println();

        System.out.println(autobus);
        System.out.println(autobus2);
        System.out.println();
    }
}
