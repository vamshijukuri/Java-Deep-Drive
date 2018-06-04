 class myThread extends Thread{
     @override
     public void run(){
        while(true){
           threadCondWait();// Circle waiting...
           //bla bla
        }
     }
     public syncronized void threadCondWait(){
        while(myCondition){
           wait();//Comminucate with notify()
        }
     }

}
public class WaitNotify extends Thread{
     @override
     public void run(){
        //Bla Bla bla
        notify();//Trigger wait() Next Step
     }

}