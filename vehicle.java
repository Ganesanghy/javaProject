

class calculator{
    protected int a,b,c,d;
    calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    int add(){
        return a+b;
    }
    float add(float a, float b){
        return a+b;
    }
    float add(int a, float b, int c, int d){
        return a+b+c+d;
    }
}




public class vehicle{
    public static void main(String[] args) {
        calculator c = new calculator(4,4);
        c.add();
        c.a =5;
        System.out.println(c.add(4.0f,2.0f));
        System.out.println(c.add(34.2f,23.f));
        System.out.println(c.add(23,2.0f,2,2));
    }
}