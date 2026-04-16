/**
Erstelle dein Programm über Blockly und
klicke auf 'Play', um es auszuführen!
*/

public class Smiley { 
    private double speedX;
    private double speedY;
    private Circle kopf;
    private Circle augeL;
    private Circle augeR;
    private Ellipse mund;


    public Smiley(double x, double y) {
        speedX = 10;
        speedY = 10;
        kopf = new Circle(x, y, 100);
        kopf.setFillColor("#33ff33");
        augeL = new Circle(x - 40, y - 30, 10);
        augeR = new Circle(x + 40, y - 30, 10);
        mund = new Ellipse(x, y + 30, 80, 20);
    }

    public boolean randErreicht() {
        boolean ergebnis = false;

        if (kopf.getCenterX() > kopf.getWorld().getWidth()) {
            ergebnis = true;
        }
        else if (kopf.getCenterX() < 0) {
            ergebnis = true;
        }

        if (kopf.getCenterY() > kopf.getWorld().getHeight()) {
            ergebnis = true;
        }
        else if (kopf.getCenterY() < 0) {
            ergebnis = true;
        }
        return ergebnis;
    }

    public void bewegen(double dx, double dy) {
        kopf.move(dx, dy);
        mund.move(dx, dy);
        augeL.move(dx, dy);
        augeR.move(dx, dy);
    }

    public void rumfliegen() {

        if (randErreicht()) {
            speedX = 0 - speedX;
            speedY = 0 - speedY;
        }
        bewegen(speedX, speedY);
    }



}