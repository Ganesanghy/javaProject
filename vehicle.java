public class vehicle {
    public void accelerator(){
        System.out.println("This vehicle have accelerator");
    }
}
public class car extends vehicle{
}
class Main{
    public static void main(String args[]){
        car v1 = new car();
        v1.accelerator();
    }
}
