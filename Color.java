public class Color extends Car{
    void run(){
        System.out.println("running safery with 60km");
    }
    void stop(){
        System.out.println("stop when there is danger");
    }
    public static void main(String [] args){
        Car car = new Color();
        car.run();
        car.stop();
    }
}
