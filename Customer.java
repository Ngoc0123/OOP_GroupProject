public class Customer extends Account{
  
  private int level;
  private String id;
  private String name;
  private String address;
  private String phone;

  public int getLevel() {
    return level;
  }
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
