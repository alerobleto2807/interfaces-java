public class main {
    public static void main(String args[]){
        System.out.println("hello world");

        MotoGp motoGp = new MotoGp();
        EjecutarAceleracion(motoGp);
        EjecutarFerenar(motoGp);
    }

    public static void EjecutarAceleracion(Automotor automotor){
        automotor.Acelera(150);
    }

    public static void EjecutarFerenar(Automotor frenos){
        frenos.Frenar(15);
    }
}

interface Automotor {
    void Acelera(int vMax);
    void Frenar(int vMin);
}

class MotoGp implements Automotor{
    public void Acelera(int vMax){
        System.out.println("Moto => Acelera 150 km/h");
    }

    public void Frenar(int vMin){
        System.out.println("Moto => Frenando.. ");
    }
}