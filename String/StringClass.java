public class StringClass{
    public static void main(String[] args) {
      //Create a variable of type String and assign it a value:  
        String greeting = "Hello";
       System.out.println(greeting);

        //length() method:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       System.out.println("The length of the txt string is: " + txt.length());


       //toUpperCase() and toLowerCase():
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"

        //The indexOf() method returns the index
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7
         

        //String Concatenation
        String firstName = "Rajib";
        String lastName = "Dash";
        System.out.println(firstName + " " + lastName);

        String fName = "John ";
        String lName = "Doe";
        System.out.println(fName.concat(lName));

        String x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String)
        System.out.println(z);
       

        String x1 = "10";
        int y1 = 20;
        String z1 = x1 + y1;  // z will be 1020 (a String)
        System.out.println(z1);


        //The sequence \"  inserts a double quote in a string:
        String str = "We are the so-called \"Vikings\" from the north.";
        System.out.println(str);
      



    }
}