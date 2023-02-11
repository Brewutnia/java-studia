public class Punkt2 {
    int x;
    int y;

    public void zwiekszX() {
        x++;
    }
    public void zwiekszY (){
        y++;
    }
    public void zmienX(int liczba){
        x += liczba;
    }
    public void zmienY(int liczba){
        y += liczba;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public String toString(){
        return "x: " + x + ", y: " + y;
    }
}
