public class Item {
    private String id;
    private String title;
    private String rentalType;
    private int loanType;
    private int stock;
    private double rentalFee;
    private String genre;
    private boolean availability;

    public Item(String id, String title, String rentalType, int loanType, int stock, double rentalFee, String genre, boolean availability){
        this.id = id;
        this.title = title;
        this.rentalType = rentalType;
        this.loanType = loanType;
        this.stock = stock;
        this.rentalFee = rentalFee;
        this.genre = genre;
        this.availability = true;
    }



}
