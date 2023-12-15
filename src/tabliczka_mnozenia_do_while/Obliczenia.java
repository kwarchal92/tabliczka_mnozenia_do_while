package tabliczka_mnozenia_do_while;

public class Obliczenia {

    public static void main(String[] args)
    {
        int n = 10, wiersze, kolumny;

        System.out.println("\nProgram wyswietla tabliczke mnozenia.\n");

        wiersze = 1; //wartosc poczatkowa

        do
        {
            kolumny = 1; //wartos poczatkowa
            do
            {
                System.out.print(wiersze * kolumny + "\t");
                kolumny++;
            }
            while (kolumny <= n);
            wiersze++;
            System.out.println();
        }
        while (wiersze <= n);
    }
}
