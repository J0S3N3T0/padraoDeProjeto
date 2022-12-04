public class ShoeLeaf implements IComponent {
  private double price;

  public ShoeLeaf (double price) {
      this.price = price;
  }

  @Override
  public double getPrice() {
      return price;
  }    
}