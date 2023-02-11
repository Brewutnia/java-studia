public class Main {
    public static void main(String[] args) {
        Polynomial doda = new Polynomial();
        doda.w1 = new int[]{2,3,1,3,3};
        doda.w2 = new int[]{4,5,7,3,0};

        int [] wynik;

        wynik = doda.sumpoly(doda.w1,doda.w2);

        for(int i = 0; i< wynik.length; i++){
            System.out.println(wynik[i]);
        }

        wynik = doda.minpoly(doda.w1,doda.w2);

        for(int i = 0; i< wynik.length; i++){
            System.out.println(wynik[i]);
        }



    }
}