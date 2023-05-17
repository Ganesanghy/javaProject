interface father {
    abstract void property();

}
interface Mother  {
    abstract void property();
}
class son implements father,Mother{
    public void property(){
        System.out.println("property");
    }
}
class in{
    public static void main(String args[]){
        son s = new son();
        s.property();
    }

}