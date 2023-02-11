public class zadkart {
    public static void main(String[] args) {
        int[] wylos = {3,5,2,3,2,4};
        int[] los = {4,3,2,3,4,4};
        /*boolean czyWystepuje = false;

        for (int i = 0; i < wylos.length; i++) {
            for (int j = 0; j < los.length; j++) {
                if (wylos[i] == los[j]) {
                    czyWystepuje = true;
                } else {
                    czyWystepuje = false;
                }
            }

        }if (czyWystepuje) {
            System.out.println("wygrałeś");
        }else {
            System.out.println("przegrałeś");
        }*/
        int i;
        for (i=0; i< los.length;i++){
            int j;
            for (j=0; j< wylos.length; j++){
                if (wylos[j]==los[i]){
                    break;
                }
            if (j== wylos.length){
                System.out.println("Spróbuje ponownie!");
                break;
            }
            if (i== los.length){
                System.out.println("Wygrałeś");
            }
            }
        }
    }
}
