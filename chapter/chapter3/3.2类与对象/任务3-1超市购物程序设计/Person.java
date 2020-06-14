
/**
 * 人
 */

public class Person {

  private String name;      //人名

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  //购物，指定去哪个超市，商品名
  Product shopping(Market market, String name) {
    //调用超市的卖货方法，指定商品名，把卖出去的结果返还
    return market.sell(name);
  }

}