import java.util.Scanner;
public class vehicle {
    int tyre = 6,head_light=2,max_gear=8;
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
    int newcar(String color,String model_no, String car_name){
        return 1;
    }
}

class Main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter car color: ");
        String color =obj.nextLine();
        System.out.println("Enter car model_no: ");
        String model_no = obj.nextLine();
        System.out.println("Enter car name: ");
        String car_name = obj.nextLine();
        car BMW = new car();
        int result = BMW.newcar(color,model_no,car_name);
        System.out.println(result);
    }
}
