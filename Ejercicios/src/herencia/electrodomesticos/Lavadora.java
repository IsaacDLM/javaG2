package herencia.electrodomesticos;

public class Lavadora extends Electrodomestico{
    private int kilosCarga;

    public Lavadora( String marca, int kilosCarga){
        super(marca);
        this.kilosCarga = kilosCarga;
    }

    public int getKilosCarga(){
        return kilosCarga;
    }

}
