public class TerrapinCard {
  private double balence;

  public TerrapinCard(double balence){
    this.balence = balence;
  }

  public void payEconomical(){
    if(this.balence >= 2.5){
    this.balence = balence - 2.5;
    }
  }

  public void payGourmet(){
    if(this.balence >= 4.0){
    this.balence = balence - 4.0;
    }
  }

  public void loadMoney(double amount){
   
    if (amount < 0){
      this.balence = this.balence;
    } else if ((this.balence + amount) > 150){
      this.balence = 150;
    } else {
      this.balence += amount;
    }
  }

  public double getBalance(){
    return this.balence;
  }

  public String toString(){
    return "The card has " + this.balence + " dollars";
  }

  

}
