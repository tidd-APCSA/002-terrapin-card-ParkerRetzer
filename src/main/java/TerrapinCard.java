public class TerrapinCard {
  private double balence;

  public TerrapinCard(double balenceAtStart){
    balence = balenceAtStart;
  }

  public double getBalence(){
    return balence;
  }

  public void loadMoney(double amount){
   
    if (amount < 0){
    balence = balence;
    } else if ((balence + amount) > 150){
      balence = 150;
    } else {
      balence += amount;
    }
  }

  public void payEconomical(){
    if(balence > 2.5){
    balence -= 2.5;
    }
  }

  public void payGourmet(){
    if(balence > 4.0){
    balence -= 4.0;
    }
  }

  

  public String toString(){

    return "The card has " + this.getBalence() + " dollars";
  }

  

}
