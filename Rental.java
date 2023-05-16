public class Rental {
    private Item item;
    private int amount;
    private String status;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public void returnItem(){
        status = "available";
        System.out.print("Your Item has been return");
    }

}
