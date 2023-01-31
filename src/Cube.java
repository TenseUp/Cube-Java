import org.junit.Test;
public class Cube {
    private int side;

    public Cube(){
        this.side = 1;
    }
    public Cube(int side){
        if (calculate(side) == true){
            this.side = side;
        }
    }

    public int getSide(){
        return side;
    }
    public void setSide(int s){
        if (calculate(s) == true){
            side = s;
            return;
        }
        
    }
    public int getSurfaceArea(){
        return 6*(side*side);
    }
    public int getVolume(){
        return side*side*side;
    }
    public String toString() {
        return String.format("Cube{side=%d}", side);
    }

    public boolean calculate(int n) {
        if (n < 1) {
          throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        return true;
    }
}
