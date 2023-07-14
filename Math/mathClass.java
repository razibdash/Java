public class mathClass{
    public static void main(String[] args) {
        //Math.max(x,y)
        System.out.println(Math.max(10, 20));

        //Math.min(x,y)
        System.out.println(Math.min(-10, 20));

        //Math.sqrt(x)
        System.out.println(Math.sqrt(64));

        //Math.abs(x)
        System.out.println(Math.abs(-4));

        //Math.random();
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
        
      //random number between 1 and 6, you can use the following formula:
        int rajib=(int)(Math.random()*6)+1;
        System.out.println(rajib);

    
    }
}