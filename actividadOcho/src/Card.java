public class Card {

//Suit
    public static enum Palo{
        treboles, corazones, picas, diamantes
    }

    public enum  Color{
        rojo,negro
    }
    //Rank
    public  enum  Valor{
        dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, A, J, Q,K
    }

    private final Palo palo;
    private  final Color color;
    private  final Valor valor;

    public Card(Palo palo,Color color, Valor valor){
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public  Palo getPalo(){
        return palo;
    }

    public  Color getColor(){
        return color;
    }

    public Valor getValor(){
        return valor;
    }
}


