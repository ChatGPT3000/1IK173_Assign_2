import java.util.Date;

public class Purchase {

    public int id;
    public Date date;
    public float amount;
    public String comment;
    public int categoryId;

    public Purchase(int id, Date date, float amount, String comment, int categoryId) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.comment = comment;
        this.categoryId = categoryId;
    }
}
