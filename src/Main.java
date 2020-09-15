import java.util.LinkedList;

class Main {

    public static void main(String[] args) {

        //tu wykorzystuję klasę skaner do wpisania-podania przez użytkownika dowolnej liczby z klawiatury
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter to number: ");
//        Integer number = scanner.nextInt();

        //tu uruchamiam metodę solution przy pomocy utworzonej klasy solution
//        Solution.solution(number);

        int liczba = 11;

        //System.out.println("Max binary gap is equals: ");
        System.out.println("Max binary gap is equals: " + Solution.printBinary(liczba, Solution.find2Expo(liczba)));

    }
}

//tu mam klasę solution w której będę tworzył metody
class Solution {

    public static int find2Expo(int numb) {
//        for(int i = 0; i<10; i++){
//
//        }
        int i = 0;
        double wynik = 0;

        while (wynik < numb) {
            wynik = Math.pow(2, i);
            if (wynik < numb) {
                i++;
            }
        }

//        (numb < /*potęgiliczby2*/ )
//
        return i - 1;
    }

    public static Integer printBinary(int numb, int potega) {
        LinkedList<Integer> listBinaryValue = new LinkedList();
        LinkedList<Integer> listLiczbaZer = new LinkedList();

        int najwiekszaLiczbaZer = 0;
        int diff = numb;
        for (int i = potega; i >= 0; i--) {
            double liczba = Math.pow(2, i);
            if (liczba <= diff) {
                System.out.println(1);
                diff = diff - (int) liczba;
                boolean checked = listBinaryValue.add(1);
                //miałem tu wcześniej jeżeli prawdą jest że checked, czyli: if (checked) {listLiczbaZer.addFirst(największaLiczbaZer)}
                if (najwiekszaLiczbaZer != 0) {
                    listLiczbaZer.addFirst(najwiekszaLiczbaZer);
                }
                najwiekszaLiczbaZer = 0;
            } else {
                najwiekszaLiczbaZer++;
                System.out.println(0);
            }

            //Integer maks = 0;
            //for (int k = 0; k < listLiczbaZer.size(); k++) {
            //    if (listLiczbaZer.get(k) > maks) {
            //        maks = listLiczbaZer.get(k);
            //    }
            //}

        }
        Integer maks = 0;
        for (int k = 0; k < listLiczbaZer.size(); k++) {
            if (listLiczbaZer.get(k) > maks) {
                maks = listLiczbaZer.get(k);
            }
        }

        System.out.println("---------------");
        return maks;

    }
}


//    public static LinkedList solution(LinkedList list) {
//        System.out.println(Main3.printBinary(11, 2));


//tworzę najpierw tablicę z potęgą liczby 2, następnie przepisuję wszystkie wartości do listy, bo nie umiem zapisać listy posiadającej już jakieś elementy,
//umiem dodać jakieś elementy do utorzonej przezemnie pustej listy
//        Integer tablicaWielokrotnośćLiczby2[] = new Integer[]{1, 2, 4, 8, 16, 32, 64, 128};
//
//        LinkedList<Integer> listaWielokrotnośćLiczby2 = new LinkedList ();
//        for (int i = 0; i < tablicaWielokrotnośćLiczby2.length; i++) {
//            listaWielokrotnośćLiczby2.add(tablicaWielokrotnośćLiczby2[i]);
//        }
//
//        LinkedList<Integer> reprezentacjaBinarnaLiczbyN = new LinkedList();
//        for (int j = 0; j<listaWielokrotnośćLiczby2.size();j++){
////            if (n < listaWielokrotnośćLiczby2.get(j)){
////                reprezentacjaBinarnaLiczbyN.add(0);
////            } else if (n == listaWielokrotnośćLiczby2.get(j)){
////                reprezentacjaBinarnaLiczbyN.add(1);
////            } else if (n> listaWielokrotnośćLiczby2.get(j)){
////                reprezentacjaBinarnaLiczbyN.add(1);
////                n -= listaWielokrotnośćLiczby2.get(j);
////            }
////        }
//        System.out.println(reprezentacjaBinarnaLiczbyN);


//        Integer binarnaReprezentacjaLiczbyN[]
//        if (N <)
//
//        przypisujemy wprowadzonego intigera i sprawdzamy jak jest liczbą
//
//        N =
//        return list;
//        }
//    }



