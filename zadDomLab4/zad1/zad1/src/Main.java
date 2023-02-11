public class Main {
    public static void main(String[] args) {
       /* Punkt punkt = new Punkt();
        punkt.setX(2);
        punkt.setY(3);

        System.out.println(punkt);

        Adres adres = new Adres("Cieszyn","43-400", "Krucza", 22 );

        System.out.println(adres);*/
      /*  Adres adres1 = new Adres("Cieszyn","43-400", "Krucza", 20);
        Osoba osoba1 = new Osoba("Katarzyna", "Kowalsak", 1997, adres1);

        Osoba osoba2 = new Osoba("Alicja", "Stokłosa", 1997, "Gliwice", "20-230", "Lotincza", 33);

        System.out.println(osoba1);
        System.out.println(osoba2);*/

      /*  Punkt2 punkt2 = new Punkt2();
        punkt2.x = 2;
        punkt2.y = 5;
        punkt2.zmienX(12);
        punkt2.zmienY(10);
        punkt2.zwiekszX();
        punkt2.zwiekszY();
        System.out.println(punkt2.getX());
        System.out.println(punkt2.getY());
        System.out.println(punkt2);*/

        Punkt2D p2D1 = new Punkt2D();
        Punkt2D p2D2 = new Punkt2D(2,3);
        Punkt3D p3D = new Punkt3D(3,4,5);

        System.out.println(p2D1.x + " " + p2D1.y);
        System.out.println(p2D2.x + " " + p2D2.y);
        System.out.println(p3D.x + " " + p3D.y + " " + p3D.z);
    }
}