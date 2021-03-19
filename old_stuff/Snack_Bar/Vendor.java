/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields:
  private int stock;
  private int price;
  private int deposited;
  private int change;
  private static double totalSales = 0;

  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  public Vendor(int price, int stock)
  {
    this.price = price;
    this.stock = stock;
    deposited = 0;
    change = 0;
  }

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  public void setStock(int qty)
  {
    this.stock = qty;
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  public int getStock()
  {
    return this.stock;
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  public void addMoney(int number)
  {
    this.deposited += number;
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  public int getDeposit()
  {
    return this.deposited;
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock and
   * calculates and sets change, sets deposit to 0 and
   * returns true; otherwise refunds the whole deposit
   * (moves it into change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  public boolean makeSale()
  {
    if(this.deposited >= this.price && this.stock > 0){
      totalSales += this.price/100.0;
      this.change = this.deposited - this.price;
      this.stock--;
      this.deposited = 0;
      return true;
    } else{
      this.change = this.deposited;
      this.deposited = 0;
      return false;
    }
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  public int getChange()
  {
    int change_returned = this.change;
    this.change = 0;
    return change_returned;
  }


  public static double getTotalSales(){
    double salesTemp = totalSales;
    totalSales = 0;
    return salesTemp;
  }

}
