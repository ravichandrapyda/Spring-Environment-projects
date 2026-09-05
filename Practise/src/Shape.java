interface  PaymentMethod{

    void CreditCard();
    String PayPal();
}

interface ProcessPayment{

 void PaymentDone();
}

class Yes implements PaymentMethod,ProcessPayment{
     public void CreditCard(){

         System.out.println(" Yes this credit card is revouklt");
     }
     public String PayPal(){

         return "it is linked to paypal";
     }
     public void PaymentDone(){

         System.out.println("Yes the payment is done");
     }
}
public class Shape{
    public static void main(String[] args){

        PaymentMethod obj = new Yes();
        ProcessPayment obj1 = new Yes();

        System.out.println(obj.PayPal());
        obj1.PaymentDone();
        obj.CreditCard();

    }
}