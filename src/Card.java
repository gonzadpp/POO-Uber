public class Card extends Payment {
    Integer numberCard;
    Integer cvv;
    String date;

    public Card(Integer id, Integer numberCard, Integer cvv, String date){
        super(id);
        this.numberCard = numberCard;
        this.cvv = cvv;
        this.date = date;
    }
}
