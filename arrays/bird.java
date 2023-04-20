/**
 * bird
 */
public class bird {

    int speed,lifetime;
    String name;
    bird(String name,String place){
        System.out.println(name+" "+place);
    }
    // product(){}
    void display(){
        
        System.out.println(speed+" "+lifetime+" ");
    }
    void sum(int a, int b){
        this.lifetime = a;
        this.speed = b;
        int sum = lifetime+speed;
        System.out.println(sum);

    }

}