public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance){
        balance = initialBalance;
    }

    public void eatAffordably(){
        double amountReq = 2.60;
        if(!(balance - amountReq < 0)){
            balance -= amountReq;
        }
    }

    public void eatHeartily(){
        double amountReq = 4.60;
        if(!(balance - amountReq < 0)){
            balance -= amountReq;
        }
    }

    public void addMoney(double amountToAdd){
        if(amountToAdd > 0){
            if(balance + amountToAdd >= 150){
                balance = 150;
            }
            else{
            balance += amountToAdd;
            }
        }
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros.";
    }
}
