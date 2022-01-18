import processing.core.PApplet;
public class TryProcessing extends PApplet
{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int speedOfBallOne=0;
    int speedOfBallTwo=0;
    int speedOfBallThree=0;
    int speedOfBallFour=0;

    public static void main(String[] args){

        PApplet.main("TryProcessing",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {

        drawCircle(HEIGHT/5,speedOfBallOne);
        drawCircle(2*HEIGHT/5,speedOfBallTwo);
        drawCircle(3*HEIGHT/5,speedOfBallThree);
        drawCircle(4*HEIGHT/5,speedOfBallFour);
        speedOfBallOne+=1;
        speedOfBallTwo+=2;
        speedOfBallThree+=3;
        speedOfBallFour+=4;
    }

    private void drawCircle(int heightFromTop, int x) {

        ellipse(x,heightFromTop, DIAMETER,DIAMETER);

    }
}
