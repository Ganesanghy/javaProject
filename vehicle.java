public class vehicle {
    public void accelerator(){
        System.out.println("This vehicle have accelerator");
    }
}
class car extends vehicle{
    public void accelerator(){
        System.out.println("All cars has accelerator");
    }
}
class Main{
    public static void main(String args[]){
        int a=10;
        car v1 = new car();
        v1.accelerator();
    }
}
