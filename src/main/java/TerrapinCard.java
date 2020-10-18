public class TerrapinCard {
  private double balence;

  public TerrapinCard(double balence){
    this.balence = (double)balence;
  }

  public double getBalence(){
    return this.balence;
  }

  public void loadMoney(double amount){
   
    if (amount < 0){
    this.balence = this.balence;
    } else if (balence + amount > 150){
      this.balence = 150;
    } else {
      this.balence += amount;
    }
  }

  public void payEconomical(){
    if(balence >= 2.5){
    this.balence -= 2.5;
    }
  }

  public void payGourmet(){
    if(balance >= 4.0){
    this.balence -= 4.0;
    }
  }

  

  public String toString(){

    return "The card has " + this.getBalence() + " dollars";
  }

  

}
