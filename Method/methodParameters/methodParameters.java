public class methodParameters{

    static void personName(String name){
        System.out.println(name+ " Dash");
    }

    static void nameAge(String name, int age){
        System.out.println(name+" Is "+age);
    }
    static int sumTwoNumber(int x,int y){
        return x+y;
    }
    static int sumThreeNumber(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args) {

        personName("Rajib");
        personName("Avronil");
        personName("Sagor");

        nameAge("Rajib", 22);
        nameAge("Sagor", 23);
        nameAge("saikot", 24);

        System.out.println(sumTwoNumber(5, 5));

        int sum=sumThreeNumber(5, 5, 5);
        System.out.println(sum);
    }
}