public class vehicle {
    public void accelerator(){
        System.out.println("This vehicle have accelerator");
    }
}
class Main{
    public static void main(String args[]){
        vehicle v = new vehicle();
        v.accelerator();
    }
}