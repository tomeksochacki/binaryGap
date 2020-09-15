import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {

        System.out.println(solutionN(11));

    }


    public static LinkedList<Integer> solutionN(int num) {
        //mam liczbę 50 i dzielę ją na dwa i sprawdzam modulo resztę z dzielenia
        LinkedList<Integer> list = new LinkedList();
        LinkedList<Integer> listLicznikZer = new LinkedList();

        Integer maksynalnaLiczbaZerWCiagu = 0;
        Integer i = 0;
        Integer score = num;
        while (score > 0) {
            Integer equalsWithMod = score % 2;
            score = score / 2;
            if (equalsWithMod == 0) {
                System.out.println("0");
                Integer zero = 0;
                list.addFirst(zero);
                maksynalnaLiczbaZerWCiagu++;
                i++;
            } else {
                System.out.println("1");
                Integer one = 1;
                list.addFirst(one);
                i++;
                if (maksynalnaLiczbaZerWCiagu != 0) {
                    listLicznikZer.addFirst(maksynalnaLiczbaZerWCiagu);
                }
                maksynalnaLiczbaZerWCiagu = 0;
            }
        }

        if (list.getLast() == 0) {
            listLicznikZer.removeLast();
        }

        Integer maks = 0;
        for (Integer nazwa : listLicznikZer) {
            Integer costam = 0;
            if (nazwa > maks) {
                maks = nazwa;
            }
        }

        System.out.println("Tablica z wynikami");
        System.out.println(listLicznikZer);

        System.out.println("Pokaż maksa");
        System.out.println(maks);

        LinkedList<Integer> listInverted = new LinkedList();
        //dla j równego list size, j jest mniejsze bądź róne 0, j --

        //int dlugosc = list.size();
        //for (int j = dlugosc; j >= 0; j--) {
        //    System.out.println(list.get());
        //}

        listInverted.descendingIterator();

        return list;
    }
}




