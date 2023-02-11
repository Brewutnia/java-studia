public class zad11 {
    public static void main(String[] args) {
        int[] t = new int[10];


     /* t[0] = 1;
        t[1] = 2;
        t[2] = 3;
        t[3] = 4;
        t[4] = 5;
        t[5] = 6;
        t[6] = 7;
        t[7] = 8;
        t[8] = 9;
        t[9] = 10;*/

       /* for (int i=0; i<t.length; i++){
            t[i] = i+1;   //10-i
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }*/

        int i = 0;
        do {
            t[i] = i+1;
            i++;
        }while (i<t.length);

        i = 0;

        do {
            System.out.println(t[i]);
            i++;
        }while (i<t.length);
    }
}
