class RacerX extends  Thread{

   public void run(){

        for(int i=1;i<=50;i++){

            System.out.println("RacerX is running....");

            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}

 class RacerY extends Thread{


   public  void run(){

        for(int j=1;j<=50;j++){

            System.out.println("Racer y is running");

            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}

public class Run{

    public static void main(String[] args) throws NumberFormatException{

       RacerX obj1 = new RacerX();
       RacerY obj2 = new RacerY();

        obj1.setPriority(Thread.MAX_PRIORITY);


        obj1.start();
        obj2.start();
    }


}