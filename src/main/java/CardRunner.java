public class CardRunner {
    public static void main(String args[]){
        
        TerrapinCard cardBilly = new TerrapinCard(20);
        TerrapinCard cardBrian = new TerrapinCard(30);
        
        //cardBilly and cardBrian can be replaced with billy and brian, however code wise this would be inefficent as the variables billy and brian would have to be redefined after every change to the balence;
        // System.out.println(billy);
        // System.out.println(brian);
        cardBilly.payGourmet();
        System.out.println("Billy: " + cardBilly);
        cardBrian.payEconomical();
        System.out.println("Brian: " + cardBrian);
        cardBilly.loadMoney(20);
        System.out.println("Billy: " + cardBilly);
        cardBrian.payGourmet();
        System.out.println("Brian: " + cardBrian);
        cardBilly.payEconomical();
        cardBilly.payEconomical();
        System.out.println("Billy: " + cardBilly);
        cardBrian.loadMoney(50);
        System.out.println("Brian: " + cardBrian);
        
        //economic = -2.5, gourmet = -4
        
    }
}
