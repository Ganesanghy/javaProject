public class vehicle {
    int tyre = 6,head_light=2;
    int max_gear = 8;
    public void brake(){
        System.out.println("This vehicle has brake");
    }
    public void clutch(){
        System.out.println("This vehicle has clutch");
    }
    public void accelerator(){
        System.out.println("This vehicle has accelerator");
    }
    public void gear(){
        System.out.println("This vehicle has maximum gear"+max_gear);
    }
}
class car extends vehicle{

    int tyre = 4,max_gear=6;
    public void gear(){
        System.out.println("car has maximum gear"+max_gear);
    }
}
class BMW extends car{
    String color = "red",model_no = "212UY",car_name = "vivo";

}
class Main{
    public static void main(String args[]){
        car c = new car();
        BMW b1 = new BMW();
        System.out.println("BMW car color"+b1.color);
        System.out.println("BMW model no"+b1.model_no);
        System.out.println("BMW car name"+b1.car_name);
        b1.accelerator();
        b1.brake();
        b1.clutch();
        b1.gear();
    }
}
