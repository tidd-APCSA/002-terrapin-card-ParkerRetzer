public class TerrapinCard {
  private double balence;

  public TerrapinCard(double balence){
    this.balence = (double)balence;
  }
  
  public void loadMoney(double amount){
    boolean balenceCap = this.balence + amount < 150;
    boolean balenceMin = this.balence + amount > 0;
    if (balenceCap == true && balenceMin == true){
    this.balence += (double)amount;
    } else if (balenceCap == false && balenceMin == true){
      this.balence = 150;
    }
  }

  public void payEconomical(){
    boolean enough = this.balence > 2.49;
    if(enough == true){
    this.balence -= 2.5;
    }
  }

  public void payGourmet(){
    boolean enough = this.balence > 3.9;
    if(enough == true){
    this.balence -= 4.0;
    }
  }

  public double getBalence(){
    return this.balence;
  }

  public String toString(){

    return "The card has " + this.getBalence() + " dollars";
  }

  

}
