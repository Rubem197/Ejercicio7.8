package principal;

public class Punto {
    private int coordinadaX;
    private int coordinadaY;

    public Punto() {

    }

    public void igual(Punto punto2) {
        Punto punto1 = new Punto();
        punto1.setCoordinadaX(coordinadaX);
        punto1.setCoordinadaY(coordinadaY);

        if (punto1.coordinadaX == punto2.coordinadaX && punto1.coordinadaY == punto2.coordinadaY) {
            System.out.println("Los puntos son iguales");
        }
    }

    public double distancia() {
        return Math.sqrt(coordinadaX * coordinadaX + coordinadaY * coordinadaY);
    }
    public double distanciaEntre(Punto punto2){

        return Math.sqrt(Math.pow((punto2.coordinadaX-coordinadaX),2) + Math.pow((punto2.coordinadaY-coordinadaY),2));
    }


    public int getCoordinadaX() {
        return coordinadaX;
    }

    public int getCoordinadaY() {
        return coordinadaY;
    }

    public void setCoordinadaX(int coordinadaX) {
        this.coordinadaX = coordinadaX;
    }

    public void setCoordinadaY(int coordinadaY) {
        this.coordinadaY = coordinadaY;
    }
}

